package com.oocl.cultivation.test;

import com.oocl.cultivation.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertSame;

public class superSmartParkingTest {
    @Test
    void should_return_ticket_when_superSmartParkingBoy_parkCar_given_car_toMostAvailablePosition() {
        //given
        Car car = new Car();
        //when
        ArrayList<parkingLot> parkingLotList =new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            parkingLotList.add(new parkingLot());
        }

        superSmartParkingBoy superSmartParkingBoy = new superSmartParkingBoy();
        superSmartParkingBoy.setParkingLotList(parkingLotList);
        for (int i = 0; i <2 ; i++) {
            superSmartParkingBoy.parkCar(new Car());
        }
        carTicket ticket =superSmartParkingBoy.parkCar(car);

        //then
        assertSame(parkingLotList.get(2),ticket.getParkingLot());
    }
}
