package org.lap6.bttl2.Services;

import org.lap6.bttl2.models.BizStudent;

import java.io.BufferedReader;
import java.io.IOException;

public class BizStudentService extends StudentService {

    public static BizStudent getStudent(BufferedReader br) throws IOException {

        System.out.print("Nhap ten: ");
        String name = br.readLine();
        double marketing = setScore("marketing", br);
        double sale = setScore("Sale", br);

        return new BizStudent(name,"Biz", sale, marketing);
    }
}
