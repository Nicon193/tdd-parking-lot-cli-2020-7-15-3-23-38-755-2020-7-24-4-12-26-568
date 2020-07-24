package com.oocl.cultivation;

import java.util.HashMap;

public class parkingLot {
    private  int capacity =10;
    HashMap<carTicket,Car> map =new HashMap<>();

    public parkingLot() {

    }

    public parkingLot(int capacity) {
        this.capacity =capacity;
    }

    public carTicket park(Car car) {
        carTicket ticket =null;
        if (map.size()==capacity){
            return ticket;
        }else{
            ticket =new carTicket();
            map.put(ticket,car);
        }
        return ticket;
    }

    public Car fetch(carTicket ticket) {
        Car car = map.get(ticket);
        map.remove(ticket);
        return car;
    }
}
