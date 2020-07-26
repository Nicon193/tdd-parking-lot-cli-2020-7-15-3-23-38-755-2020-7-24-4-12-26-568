package com.oocl.cultivation;

public class parkingBoy {
   private parkingLot parkinglot;
   private carTicket ticket;

    public parkingBoy(parkingLot parkinglot) {
        this.parkinglot = parkinglot;
    }

    public carTicket parkCar(Car car) {
        return parkinglot.park(car);
    }

    public Car fetchCar(carTicket ticket) {

        return parkinglot.fetch(ticket);
    }


    public parkingLot getParkinglot() {
        return parkinglot;
    }

    public void setParkinglot(parkingLot parkinglot) {
        this.parkinglot = parkinglot;
    }

    public carTicket getTicket() {
        return ticket;
    }

    public void setTicket(carTicket ticket) {
        this.ticket = ticket;
    }
}