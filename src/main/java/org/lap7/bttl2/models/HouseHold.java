package org.lap7.bttl2.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
public class HouseHold {

    private int houseID;
    private int numOfMembers;
    private ArrayList<Member> members;

    @Override
    public String toString() {
        return "HouseHold{" +
                "houseID=" + houseID +
                ", numOfMembers=" + numOfMembers +
                ", members=" + members +
                '}';
    }
}
