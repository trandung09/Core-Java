package org.lap6.bttl2;

import org.lap6.bttl2.models.TechmasterStudent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private TechmasterStudent[] techmasterStudents;

    public void setStudentInfo() throws IOException {
        int n;
        do {
            System.out.print("Nhap so luong sinh vien: ");
            n = Integer.parseInt(br.readLine());

            if (n <= 0) {
                System.out.println("Hay so hoc sinh > 0");
            }
        } while (n <= 0);

        techmasterStudents = new TechmasterStudent[n];

        TechmasterStudentService studentService = TechmasterStudentService.getInstance();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap nganh hoc (it/biz): ");
            String branch = br.readLine();
            techmasterStudents[i] = studentService.getStudent(branch, br);
        }
    }

    public void getStudentInfo() throws IOException {
        if (techmasterStudents == null || techmasterStudents.length == 0) {
            System.out.println("Khong co sinh vien nao!");
            return;
        }

        for (TechmasterStudent techmasterStudent : techmasterStudents) {
            if (techmasterStudent == null) {
                continue;
            }
            techmasterStudent.printAllInfo();
        }
    }

    public static void main(String[] args) throws IOException {

        Application app = new Application();
        app.setStudentInfo();
        app.getStudentInfo();
    }
}
