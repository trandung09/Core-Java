package org.lap7.bttl2.services;

import org.lap7.bttl2.models.HouseHold;
import org.lap7.bttl2.models.Member;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class HouseHoldService {

    private HouseHoldService() {}

    public HouseHold getHouseHold(BufferedReader br) throws IOException {
        System.out.print("Enter house id: ");
        int houseID = Integer.parseInt(br.readLine());
        System.out.print("Enter number of member: ");
        int numOfMember = Integer.parseInt(br.readLine());

        MemberService memberService = MemberService.getInstance();
        ArrayList<Member> members = new ArrayList<>();
        for (int i = 0; i < numOfMember; i++) {
            Member member = memberService.getMember(br);
            members.add(member);
        }

        return new HouseHold(houseID, numOfMember, members);
    }

    public static HouseHoldService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final HouseHoldService INSTANCE = new HouseHoldService();
    }
}
