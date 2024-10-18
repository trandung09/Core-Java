package org.lap7.bttl2.services;

import org.lap7.bttl2.models.Member;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MemberService {

    private MemberService() {}

    public Member getMember(BufferedReader br) throws IOException {

        System.out.print("Enter member name: ");
        String name = br.readLine();
        System.out.print("Enter member gender: ");
        String gender = br.readLine();
        System.out.print("Enter member birth date: ");
        String birthDate = br.readLine();
        LocalDate birth = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        return new Member(name, gender, birth);
    }

    public static MemberService getInstance() {
        return SingletonHolder .INSTANCE;
    }
    private static class SingletonHolder {
        private static final MemberService INSTANCE = new MemberService();
    }
}
