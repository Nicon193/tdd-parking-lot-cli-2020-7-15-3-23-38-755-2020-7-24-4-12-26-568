package com.oocl.cultivation;

public class parkingBoy {
    parkingLot parkinglot;
    carTicket ticket;

    public parkingBoy(parkingLot parkinglot) {
        this.parkinglot = parkinglot;
    }

    public carTicket parkCar(Car car) {
        return parkinglot.park(car);
    }

    public Car fetchCar(carTicket ticket) {

        return parkinglot.fetch(ticket);
    }


    public String receiveTicket(carTicket ticket){
        if(ticket==null){
            this.ticket=ticket;
            return "Please provide your parking ticket.";
        }

        return "wait a moment";

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