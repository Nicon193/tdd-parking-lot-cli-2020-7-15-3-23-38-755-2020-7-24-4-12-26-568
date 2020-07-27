package com.oocl.cultivation;

import java.util.HashMap;

public class parkingLot {
    private int capacity = 10;
    HashMap<carTicket, Car> ticketCarMap = new HashMap<>();

    public parkingLot() {

    }

    public parkingLot(int capacity) {
        this.capacity = capacity;
    }

    public carTicket park(Car car) throws Exception {

        carTicket ticket = null;
        if (ticketCarMap.size() == capacity) {
            return null;
        } else {
            ticket = new carTicket();
            ticketCarMap.put(ticket, car);
        }
        return ticket;
    }

    public Car fetch(carTicket ticket) throws Exception {
        Car car = null;
        if (isTicketReal(ticket)) {
            car = ticketCarMap.get(ticket);
            ticketCarMap.remove(ticket);
            return car;
        } else {
            throw new Exception("Unrecognized parking ticket.");
        }
    }


    public boolean isTicketReal(carTicket ticket) {
        return this.getTicketCarMap().containsKey(ticket);
    }

    public int returnIdleNum() {
        return this.getCapacity() - this.getTicketCarMap().size();
    }


    public double returnAvailablePositionRate() {
        return this.returnIdleNum() * 1.0 / this.getCapacity();
    }

    public HashMap<carTicket, Car> getTicketCarMap() {
        return ticketCarMap;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
