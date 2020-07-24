package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.carTicket;
import com.oocl.cultivation.parkingLot;
import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.LockSupport;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class parkingLotTest {
    @Test
    void should_return_carTicket_when_parkingLot_park_given_car() {
        //given
        Car car = new Car();

        //when
        parkingLot parkinglot = new parkingLot();
        carTicket ticket =parkinglot.park(car);

        //then
        assertNotNull(ticket);
    }
}
