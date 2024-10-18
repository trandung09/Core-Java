package org.lap7.bttl.lap1;

import org.lap7.bttl.lap1.models.Student;
import org.lap7.bttl.lap1.services.StudentService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private final Student[] students = new Student[100];

    public void solve() throws IOException {

        StudentService studentService = StudentService.getInstance();

        String answer;
        do {
            System.out.println("Nhap thong tin sinh vien: ");
            Student student = studentService.getStudent(br);

            students[student.getId()] =  student;

            System.out.println("Ban co muon them sinh vien nua khong (y/n)?: ");
            answer = br.readLine();

        } while (answer.equalsIgnoreCase("y"));

        for (Student student : students) {
            if (student == null) break;

            System.out.println(student);
        }
    }

    public static void main(String[] args) throws IOException {

        new Application().solve();
    }
}
