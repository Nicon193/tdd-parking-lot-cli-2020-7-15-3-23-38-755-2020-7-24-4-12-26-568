package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.carTicket;
import com.oocl.cultivation.parkingBoy;
import com.oocl.cultivation.parkingLot;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class smartParkingBoyTest {
    @Test
    void should_return_ticket_when_smartParkingBoy_parkCar_given_car_toMostIdleLot() {
        //given
        Car car = new Car();
        //when
        ArrayList<parkingLot> parkingLotList =new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            parkingLotList.add(new parkingLot());
        }

        parkingBoy parkingboy = new parkingBoy();
        parkingboy.setParkingLotList(parkingLotList);
        for (int i = 0; i <2 ; i++) {
            parkingboy.parkCar(new Car());
        }
        carTicket ticket =parkingboy.parkCar(car);

        //then
        assertTrue(ticket.getParkingLot()==parkingLotList.get(2));
    }
}
