package com.oocl.cultivation;

public class smartParkingBoy extends parkingBoy {

    @Override
    public carTicket parkCar(Car car) throws Exception {
        carTicket ticket;
        int maxNum = -1;
        parkingLot mostIdelParkingLot = this.getParkingLotList().get(0);

        for (parkingLot pakingLot : getParkingLotList()) {
            if (pakingLot.returnIdleNum() > maxNum) {
                maxNum = pakingLot.returnIdleNum();
                mostIdelParkingLot = pakingLot;
            }
        }
        ticket = mostIdelParkingLot.park(car);

        if (ticket == null) {
            throw new Exception("Not enough position.");
        }

        ticket.setParkingLot(mostIdelParkingLot);
        ticket.setCar(car);

        return ticket;
    }
}
