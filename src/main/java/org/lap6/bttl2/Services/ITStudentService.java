package org.lap6.bttl2.Services;

import org.lap6.bttl2.models.ITStudent;

import java.io.BufferedReader;
import java.io.IOException;

public class ITStudentService extends StudentService {

    public static ITStudent getStudent(BufferedReader br) throws IOException {

        System.out.print("Nhap ten: ");
        String name = br.readLine();
        double java = setScore("java", br);
        double html = setScore("html", br);
        double css = setScore("css", br);

        return new ITStudent(name, "IT", java, html, css);
    }
}
