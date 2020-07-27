//package com.oocl.cultivation.test;
//
//import com.oocl.cultivation.*;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class customerTest {
//    @Test
//    void should_errorMessage_when_customer_getResponseMessage_given_wrongOrUsedCarTicket() throws Exception {
//        //given
//        customer customer = new customer();
//        parkingLot parkinglot = new parkingLot();
//        carTicket ticket =new carTicket();
//        ticket.setParkingLot(parkinglot);
//        customer.setTicket(ticket);
//
//        //when
//        ArrayList<parkingLot> parkingLotList =new ArrayList<>();
//        parkingLotList.add(parkinglot);
//        parkingBoy parkingBoy = new parkingBoy();
//        parkingBoy.setParkingLotList(parkingLotList);
//        Car carFetch =parkingBoy.fetchCar(customer.getTicket());
//        String responseMessage =customer.getResponseMessage(carFetch);
//
//        //then
//        assertEquals("Unrecognized parking ticket.",responseMessage);
//    }
//
//
//    @Test
//    void should_errorMessage_when_customer_getResponseMessage_given_noCarTicket() throws Exception {
//        //given
//        customer customer = new customer();
//
//        //when
//        parkingLot parkinglot = new parkingLot();
//        ArrayList<parkingLot> parkingLotList =new ArrayList<>();
//        parkingLotList.add(parkinglot);
//        parkingBoy parkingBoy = new parkingBoy();
//        parkingBoy.setParkingLotList(parkingLotList);
//
//        Car carFetch =parkingBoy.fetchCar(customer.getTicket());
//        String responseMessage =customer.getResponseMessage(carFetch);
//
//
//        //then
//        assertEquals("Please provide your parking ticket.",responseMessage);
//
//    }
//
//
//    @Test
//    void should_errorMessage_when_customer_getResponseMessage_given_noPlaceToPark() throws Exception {
//        //given
//        customer customer = new customer();
//        Car car = new Car();
//        customer.setCar(car);
//
//
//        //when
//        parkingLot parkinglot = new parkingLot();
//        ArrayList<parkingLot> parkingLotList =new ArrayList<>();
//        parkingLotList.add(parkinglot);
//        parkingBoy parkingBoy = new parkingBoy();
//        parkingBoy.setParkingLotList(parkingLotList);
//        for (int i = 0; i <=10 ; i++) {
//                parkinglot.park(new Car());
//        }
//        carTicket carTicket=parkingBoy.parkCar(customer.getCar());
//        String responseMessage =customer.getResponseMessage(carTicket);
//
//        //then
//        assertEquals("Not enough position.",responseMessage);
//    }
//
//
//}
