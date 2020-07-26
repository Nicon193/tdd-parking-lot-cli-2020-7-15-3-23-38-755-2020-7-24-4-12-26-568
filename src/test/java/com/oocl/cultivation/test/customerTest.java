package com.oocl.cultivation.test;

import com.oocl.cultivation.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class customerTest {
    @Test
    void should_errorMessage_when_customer_getResponseMessage_given_wrongOrUsedCarTicket() {
        //given
        customer customer = new customer();
        carTicket ticket =new carTicket();
        customer.setTicket(ticket);

        //when
        parkingLot parkinglot = new parkingLot();
        parkingBoy parkingBoy = new parkingBoy(parkinglot);
        Car carFetch =parkingBoy.fetchCar(customer.getTicket());
        String responseMessage =customer.getResponseMessage(carFetch);

        //then
        assertEquals("Unrecognized parking ticket.",responseMessage);
    }


    @Test
    void should_errorMessage_when_customer_getResponseMessage_given_noCarTicket() {
        //given
        customer customer = new customer();


        //when
        parkingLot parkinglot = new parkingLot();
        parkingBoy parkingBoy = new parkingBoy(parkinglot);
        Car carFetch =parkingBoy.fetchCar(customer.getTicket());
        String responseMessage =customer.getResponseMessage(carFetch);

        //then
        assertEquals("Please provide your parking ticket.",responseMessage);
    }


    @Test
    void should_errorMessage_when_customer_getResponseMessage_given_noPlaceToPark() {
        //given
        customer customer = new customer();
        Car car = new Car();
        customer.setCar(car);


        //when
        parkingLot parkinglot = new parkingLot();
        parkingBoy parkingBoy = new parkingBoy(parkinglot);
        for (int i = 0; i <=10 ; i++) {
                parkinglot.park(new Car());
        }
        carTicket carTicket=parkingBoy.parkCar(customer.getCar());
        String responseMessage =customer.getResponseMessage(carTicket);

        //then
        assertEquals("Not enough position.",responseMessage);
    }

    
}
