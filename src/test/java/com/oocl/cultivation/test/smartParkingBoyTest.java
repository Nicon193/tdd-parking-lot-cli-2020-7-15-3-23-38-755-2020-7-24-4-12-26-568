package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.carTicket;
import com.oocl.cultivation.smartParkingBoy;
import com.oocl.cultivation.parkingLot;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class smartParkingBoyTest {
    @Test
    void should_return_ticket_when_smartParkingBoy_parkCar_given_car_toMostIdleLot() throws Exception {
        //given
        Car car = new Car();
        //when
        ArrayList<parkingLot> parkingLotList =new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            parkingLotList.add(new parkingLot());
        }

        smartParkingBoy smartParkingBoy = new smartParkingBoy();
        smartParkingBoy.setParkingLotList(parkingLotList);
        for (int i = 0; i <2 ; i++) {
            smartParkingBoy.parkCar(new Car());
        }
        carTicket ticket =smartParkingBoy.parkCar(car);

        //then
        assertSame(parkingLotList.get(2),ticket.getParkingLot());
    }
}
