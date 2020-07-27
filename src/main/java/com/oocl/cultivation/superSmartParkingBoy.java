package com.oocl.cultivation;

public class superSmartParkingBoy extends parkingBoy {

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
        ticket.setParkingLot(mostAvailablePositionLot);
        ticket.setCar(car);

        return ticket;
    }
}
