package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.carTicket;
import com.oocl.cultivation.parkingBoy;
import com.oocl.cultivation.parkingLot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class parkingBoyTest {

    @Test
    void should_return_ticket_when_parkingBoy_parkCar_given_car() {
        //given
        Car car = new Car();

        //when
        parkingLot parkinglot = new parkingLot();
        parkingBoy parkingboy = new parkingBoy(parkinglot);
        carTicket ticket = parkingboy.parkCar(car);

        //then
        assertNotNull(ticket);
    }

    @Test
    void should_return_multiTickets_when_parkingBoy_parkCar_given_multiCars() {
        //given
        Car car1 = new Car();
        Car car2 = new Car();

        //when
        parkingLot parkinglot = new parkingLot();
        parkingBoy parkingboy = new parkingBoy(parkinglot);
        carTicket ticket1 = parkingboy.parkCar(car1);
        carTicket ticket2 = parkingboy.parkCar(car2);

        //then
        assertNotNull(ticket1);
        assertNotNull(ticket2);
    }

    @Test
    void should_fetch_car_when_parkingBoy_fetchCar_given_carTicket() {
        //given
        Car car = new Car();

        //when
        parkingLot parkinglot = new parkingLot();
        parkingBoy parkingboy = new parkingBoy(parkinglot);
        carTicket ticket = parkingboy.parkCar(car);
        Car carFetch = parkingboy.fetchCar(ticket);

        //then
        assertNotNull(carFetch);
    }



}
