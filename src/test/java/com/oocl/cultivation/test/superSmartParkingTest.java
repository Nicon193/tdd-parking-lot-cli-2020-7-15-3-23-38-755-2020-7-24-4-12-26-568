package com.oocl.cultivation.test;

import com.oocl.cultivation.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertSame;

public class superSmartParkingTest {
    @Test
    void should_return_ticket_when_superSmartParkingBoy_parkCar_given_car_toMostAvailablePosition() throws Exception {
        //given
        Car car = new Car();
        //when
        ArrayList<parkingLot> parkingLotList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            parkingLotList.add(new parkingLot());
        }

        parkingLotList.get(0).setCapacity(20);
        parkingLotList.get(0).park(new Car());
        parkingLotList.get(1).park(new Car());


        superSmartParkingBoy superSmartParkingBoy = new superSmartParkingBoy();
        superSmartParkingBoy.setParkingLotList(parkingLotList);

        carTicket ticket = superSmartParkingBoy.parkCar(car);

        //then
        assertSame(parkingLotList.get(0), ticket.getParkingLot());
    }
}
