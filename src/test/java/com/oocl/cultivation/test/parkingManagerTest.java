package com.oocl.cultivation.test;

import com.oocl.cultivation.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class parkingManagerTest {

    @Test
    void should_return_true_when_add_parkingBou_given_parkingBoy() {
        //given
        parkingBoy parkingBoy =new parkingBoy();
        parkingManager manager = new parkingManager();

        //when
        boolean result = manager.addParkingBoy(parkingBoy);

        //then
        assertTrue(result);
    }
    @Test
    void should_return_ticket_true_when_parkingManager_park_given_car() throws Exception {
        //given
        Car car = new Car();

        //when
        parkingManager manager = new parkingManager();
        ArrayList<parkingLot> parkingLotList = new ArrayList<>();
        parkingLot parkingLot =new parkingLot();
        parkingLotList.add(parkingLot);
        manager.setParkingLotList(parkingLotList);
        carTicket ticket= manager.parkCar(car);

        //then
        assertNotNull(ticket);
    }

    @Test
    void should_return_car_when_parkingManager_fetchCar_given_ticket() throws Exception {
        //given
        Car car = new Car();

        //when
        parkingManager manager = new parkingManager();
        ArrayList<parkingLot> parkingLotList = new ArrayList<>();
        parkingLot parkingLot =new parkingLot();
        parkingLotList.add(parkingLot);
        manager.setParkingLotList(parkingLotList);
        carTicket ticket= manager.parkCar(car);

        Car car1 =manager.fetchCar(ticket);

        //then
        assertTrue(car==car1);
    }

    @Test
    void should_return_ticket_when_parkingManager_appointOneToPark_given_car() throws Exception {
        //given
        Car car = new Car();

        //when
        parkingManager manager = new parkingManager();
        ArrayList<parkingLot> parkingLotList = new ArrayList<>();
        parkingLot parkingLot =new parkingLot();
        parkingLotList.add(parkingLot);
        manager.addParkingBoy(new parkingBoy(parkingLotList));
        manager.addParkingBoy(new smartParkingBoy(parkingLotList));
        manager.addParkingBoy(new superSmartParkingBoy(parkingLotList));

       carTicket ticket = manager.appointOneToPark(2,car);


        //then
        assertNotNull(ticket);
    }

    @Test
    void should_return_car_when_parkingManager_appointOneToFetch_given_ticket() throws Exception {
        //given
        Car car = new Car();

        //when
        parkingManager manager = new parkingManager();
        ArrayList<parkingLot> parkingLotList = new ArrayList<>();
        parkingLot parkingLot =new parkingLot();
        parkingLotList.add(parkingLot);
        manager.addParkingBoy(new parkingBoy(parkingLotList));
        manager.addParkingBoy(new smartParkingBoy(parkingLotList));
        manager.addParkingBoy(new superSmartParkingBoy(parkingLotList));

        carTicket ticket = manager.appointOneToPark(2,car);

        Car car1 =manager.appointOneToFetch(0,ticket);


        //then
        assertTrue(car == car1);
    }


}
