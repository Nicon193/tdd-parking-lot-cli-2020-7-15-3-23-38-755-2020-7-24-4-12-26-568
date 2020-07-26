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

    
}
