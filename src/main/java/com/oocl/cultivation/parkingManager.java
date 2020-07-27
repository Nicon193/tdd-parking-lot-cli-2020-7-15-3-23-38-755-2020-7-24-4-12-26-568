package com.oocl.cultivation;

import java.util.ArrayList;
import java.util.List;

public class parkingManager extends parkingBoy{
    List<parkingBoy> parkingBoyList = new ArrayList<>();


    public boolean addParkingBoy(parkingBoy parkingBoy) {
        return parkingBoyList.add(parkingBoy);
    }
}
