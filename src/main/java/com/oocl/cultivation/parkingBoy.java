package com.oocl.cultivation;

import java.util.ArrayList;

public class parkingBoy {
   private ArrayList<parkingLot> parkingLotList;


    public carTicket parkCar(Car car) {
        carTicket ticket=null;
        for (parkingLot parkinglot:parkingLotList) {
            ticket=parkinglot.park(car);
            if (ticket!=null){
                ticket.setCar(car);
                ticket.setParkingLot(parkinglot);
                break;
            }
        }
        return ticket;
    }

    public Car fetchCar(carTicket ticket) {

        if(ticket==null) return null;

        return ticket.getParkingLot().fetch(ticket);
    }


    public ArrayList<parkingLot> getParkingLotList() {
        return parkingLotList;
    }

    public void setParkingLotList(ArrayList<parkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
    }
}