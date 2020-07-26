package com.oocl.cultivation;

public class superSmartParkingBoy extends parkingBoy{

    @Override
    public carTicket parkCar(Car car) {
        carTicket ticket ;
        parkingLot mostAvailablePositionLot = null;

        for (int i = 0; i <this.getParkingLotList().size()-1; i++) {
            int firstCapacity =getParkingLotList().get(i).getCapacity();
            int firstAvailablePostion =getParkingLotList().get(i).getCapacity()-getParkingLotList().get(i).getMap().size();
            int secondCapacity =getParkingLotList().get(i+1).getCapacity();
            int secondAvailablePostion =getParkingLotList().get(i+1).getCapacity()-getParkingLotList().get(i+1).getMap().size();

            if(firstAvailablePostion/firstCapacity<=secondAvailablePostion/secondCapacity)
                mostAvailablePositionLot =getParkingLotList().get(i+1);
        }


        assert mostAvailablePositionLot != null;
        ticket=mostAvailablePositionLot.park(car);
        ticket.setParkingLot(mostAvailablePositionLot);
        ticket.setCar(car);

        return ticket;
    }
}
