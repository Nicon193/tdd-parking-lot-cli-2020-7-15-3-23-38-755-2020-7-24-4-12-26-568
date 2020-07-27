package com.oocl.cultivation;

public class superSmartParkingBoy extends parkingBoy{

    @Override
    public carTicket parkCar(Car car) {
        carTicket ticket ;
        parkingLot mostAvailablePositionLot = this.getParkingLotList().get(0);
        double maxAvailablePositionRate =mostAvailablePositionLot.returnAvailablePositionRate();

//        for (int i = 1; i <this.getParkingLotList().size()-1; i++) {
//            int firstCapacity =getParkingLotList().get(i).getCapacity();
//            int firstAvailablePostion =getParkingLotList().get(i).getCapacity()-getParkingLotList().get(i).getMap().size();
//            int secondCapacity =getParkingLotList().get(i+1).getCapacity();
//            int secondAvailablePostion =getParkingLotList().get(i+1).getCapacity()-getParkingLotList().get(i+1).getMap().size();}

        for (parkingLot pakingLot:getParkingLotList()) {
            if(pakingLot.returnAvailablePositionRate()>=maxAvailablePositionRate){
                maxAvailablePositionRate =pakingLot.returnAvailablePositionRate();
                mostAvailablePositionLot=pakingLot;
            }
        }



        ticket=mostAvailablePositionLot.park(car);
        ticket.setParkingLot(mostAvailablePositionLot);
        ticket.setCar(car);

        return ticket;
    }
}
