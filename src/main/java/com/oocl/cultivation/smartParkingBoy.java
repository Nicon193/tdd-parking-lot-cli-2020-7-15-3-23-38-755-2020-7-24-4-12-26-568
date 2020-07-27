package com.oocl.cultivation;

public class smartParkingBoy extends parkingBoy{

    @Override
    public carTicket parkCar(Car car) {
        carTicket ticket ;
        int maxNum=-1;
        parkingLot mostIdelParkingLot = this.getParkingLotList().get(0);

//        for (int i = 0; i <this.getParkingLotList().size()-1; i++) {
//            if(this.getParkingLotList().get(i).getMap().size()>=this.getParkingLotList().get(i+1).getMap().size())
//                mostIdelParkingLot = this.getParkingLotList().get(i+1);
//        }

        for (parkingLot pakingLot:getParkingLotList()) {
            if(pakingLot.returnIdleNum()>maxNum){
                maxNum=pakingLot.returnIdleNum();
                mostIdelParkingLot=pakingLot;
            }

        }

        ticket=mostIdelParkingLot.park(car);
        ticket.setParkingLot(mostIdelParkingLot);
        ticket.setCar(car);

        return ticket;
    }
}
