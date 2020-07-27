package com.oocl.cultivation.test;

import com.oocl.cultivation.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;


public class parkingLotTest {
    @Test
    void should_return_carTicket_when_parkingLot_park_given_car() throws Exception {
        //given
        Car car = new Car();

        //when
        parkingLot parkinglot = new parkingLot();
        carTicket ticket =parkinglot.park(car);

        //then
        assertNotNull(ticket);
    }

    @Test
    void should_return_carTicket_when_parkingLot_park_given_multiCars() throws Exception {
        //given
        Car car = new Car();


        //when
        parkingLot parkinglot = new parkingLot();
        carTicket ticket =parkinglot.park(car);

        //then
        assertNotNull(ticket);
    }

    @Test
    void should_fetch_car_when_parkingLot_parkingLot_fetch_given_carTicket() throws Exception {
        //given
        Car car = new Car();

        //when
        parkingLot parkinglot = new parkingLot();
        carTicket ticket =parkinglot.park(car);
        Car carFetch =parkinglot.fetch(ticket);

        //then
        assertNotNull(carFetch);
    }

    @Test
    void should_noCar_when_parkingLot_parkingLot_fetch_given_wrongCarTicket() throws Exception {
        //given
        carTicket ticket =new carTicket();

        //when
        parkingLot parkinglot = new parkingLot();

        Car carFetch =parkinglot.fetch(ticket);

        //then
        assertNull(carFetch);
    }

    @Test
    void should_noCar_when_parkingLot_parkingLot_fetch_given_hadUsedCarTicket() throws Exception {
        //given
        Car car = new Car();

        //when
        parkingLot parkinglot = new parkingLot();
        carTicket ticket = parkinglot.park(car);
        parkinglot.fetch(ticket);
        Car secondFetchCar = parkinglot.fetch(ticket);

        //then
        assertNull(secondFetchCar);
    }

    @Test
    void should_cantParkingCar_when_parkingLot_parkingLot_park_given_parkGT10() throws Exception {
        //given
        carTicket ticket =new carTicket();


        //when
        parkingLot parkinglot = new parkingLot(10);
        for (int i = 0; i <=10 ; i++) {
            ticket= parkinglot.park(new Car());
        }

        //then
        assertNull(ticket);
    }



}
