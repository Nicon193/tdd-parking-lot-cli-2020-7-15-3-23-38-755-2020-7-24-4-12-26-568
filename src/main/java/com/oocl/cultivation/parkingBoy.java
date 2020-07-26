package com.oocl.cultivation;

public class parkingBoy {
    parkingLot parkinglot;

    public parkingBoy(parkingLot parkinglot) {
        this.parkinglot = parkinglot;
    }

    public carTicket parkCar(Car car) {
        return parkinglot.park(car);
    }

    public Car fetchCar(carTicket ticket) {

        return parkinglot.fetch(ticket);
    }
}
