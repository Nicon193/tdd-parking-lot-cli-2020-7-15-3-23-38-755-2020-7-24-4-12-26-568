package com.oocl.cultivation;

import java.util.HashMap;

public class parkingLot {
    private int capacity = 10;
    HashMap<carTicket, Car> map = new HashMap<>();

    public parkingLot() {

    }

    public parkingLot(int capacity) {
        this.capacity = capacity;
    }

    public carTicket park(Car car) throws Exception {

        carTicket ticket = null;
        if (map.size() == capacity) {
            return null;
        } else {
            ticket = new carTicket();
            map.put(ticket, car);
        }
        return ticket;
    }

    public Car fetch(carTicket ticket) throws Exception {
         Car car=null;
        if(isTicketReal(ticket)){
         car = map.get(ticket);
        map.remove(ticket);
        return car;
        }else
            {
                throw new Exception("Unrecognized parking ticket.");
        }
    }

    public boolean isTicketReal(carTicket ticket) {
       return this.getMap().containsKey(ticket);
    }

    public int returnIdleNum(){
        return this.getCapacity()-this.getMap().size();
    }


    public double returnAvailablePositionRate(){
        return this.returnIdleNum()*1.0/this.getCapacity();
    }

    public HashMap<carTicket, Car> getMap() {
        return map;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
