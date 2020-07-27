package com.oocl.cultivation;

import java.util.ArrayList;

public class superSmartParkingBoy extends parkingBoy {

    public superSmartParkingBoy() {

    }

    public superSmartParkingBoy(ArrayList<parkingLot> parkingLotList) {
        this.parkingLotList=parkingLotList;
    }

    @Override
    public carTicket parkCar(Car car) throws Exception {
        carTicket ticket;
        parkingLot mostAvailablePositionLot = this.getParkingLotList().get(0);
        double maxAvailablePositionRate = mostAvailablePositionLot.returnAvailablePositionRate();

        for (parkingLot pakingLot : getParkingLotList()) {
            if (pakingLot.returnAvailablePositionRate() >= maxAvailablePositionRate) {
                maxAvailablePositionRate = pakingLot.returnAvailablePositionRate();
                mostAvailablePositionLot = pakingLot;
            }
        }
        ticket = mostAvailablePositionLot.park(car);

        if (ticket == null) {
            throw new Exception("Not enough position.");
        }

        ticket.setParkingLot(mostAvailablePositionLot);
        ticket.setCar(car);

        return ticket;
    }
}
