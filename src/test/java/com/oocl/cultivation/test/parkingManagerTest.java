package com.oocl.cultivation.test;

import com.oocl.cultivation.parkingBoy;
import com.oocl.cultivation.parkingManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class parkingManagerTest {

    @Test
    void should_return_true_when_add_parkingBou_given_parkingBoy() {
        //given
        parkingBoy parkingBoy =new parkingBoy();
        parkingManager manager = new parkingManager();

        //when
        boolean result = manager.addParkingBoy(parkingBoy);

        //then
        assertTrue(result);
    }
}
