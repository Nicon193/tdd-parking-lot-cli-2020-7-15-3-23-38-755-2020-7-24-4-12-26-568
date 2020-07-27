package com.oocl.cultivation;

import java.util.ArrayList;
import java.util.List;

public class parkingManager extends parkingBoy{
    List<parkingBoy> parkingBoyList = new ArrayList<>();


    public boolean addParkingBoy(parkingBoy parkingBoy) {

        return parkingBoyList.add(parkingBoy);
    }

    public carTicket appointOneToPark(int i, Car car) throws Exception {

        if(i<parkingBoyList.size()){
           return parkingBoyList.get(i).parkCar(car);
        }
        return null;
    }

    public Car appointOneToFetch(int i, carTicket ticket) throws Exception {
        return parkingBoyList.get(i).fetchCar(ticket);

    }
}
