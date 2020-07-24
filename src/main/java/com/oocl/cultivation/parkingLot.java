package com.oocl.cultivation;

import java.util.HashMap;

public class parkingLot {
    HashMap<carTicket,Car> map =new HashMap<>();

    public carTicket park(Car car) {
        carTicket ticket= new carTicket();

        map.put(ticket,car);
        return ticket;
    }

    public Car fetch(carTicket ticket) {
        Car car = map.get(ticket);
        map.remove(ticket);
        return car;
    }
}
