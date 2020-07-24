package com.oocl.cultivation;

public class parkingBoy {
    parkingLot parkinglot = new parkingLot();


    public carTicket parkCar(Car car) {
        return parkinglot.park(car);
    }

    public Car fetchCar(carTicket ticket) {
        return parkinglot.fetch(ticket);
    }
}
