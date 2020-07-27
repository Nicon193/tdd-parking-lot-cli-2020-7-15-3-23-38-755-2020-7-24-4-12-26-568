package com.oocl.cultivation;

import java.util.ArrayList;

public class parkingBoy {
    ArrayList<parkingLot> parkingLotList;


    public carTicket parkCar(Car car) throws Exception {

        carTicket ticket =null;
        for (parkingLot parkinglot:parkingLotList) {
            ticket=parkinglot.park(car);
            if (ticket!=null){
                ticket.setCar(car);
                ticket.setParkingLot(parkinglot);
                break;
            }
        }
        if(ticket==null){
            throw new Exception("Not enough position.");
        }
        return ticket;

    }

    public Car fetchCar(carTicket ticket) throws Exception {
        if(ticket==null) {
            throw new Exception("Please provide your parking ticket.");

            }

        return ticket.getParkingLot().fetch(ticket);
    }


    public ArrayList<parkingLot> getParkingLotList() {
        return parkingLotList;
    }

    public void setParkingLotList(ArrayList<parkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
    }
}