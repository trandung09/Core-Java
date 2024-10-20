package org.lap7.bttl2;

import org.lap7.bttl2.models.HouseHold;
import org.lap7.bttl2.services.HouseHoldService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Application {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        ArrayList<HouseHold> houseHolds = new ArrayList<>();

        HouseHoldService houseHoldService = HouseHoldService.getInstance();
        int count = 0;

        while (count < 1) {
            houseHolds.add(houseHoldService.getHouseHold(br));
            count++;
        }

        for (HouseHold houseHold : houseHolds) {
            System.out.println(houseHold);
        }
    }
}
