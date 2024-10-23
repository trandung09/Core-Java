package org.lap7.bttl.lap2;

import org.lap7.bttl.lap2.models.Student;
import org.lap7.bttl.lap2.services.StudentService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Application {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<Student> students = new ArrayList<>();

    public void solve() throws IOException {

        StudentService studentService = StudentService.getInstance();

        String answer;
        do {
            System.out.println("Nhap thong tin sinh vien: ");
            Student student = studentService.getStudent(br);

            students.add(student);

            System.out.println("Ban co muon them sinh vien nua khong (y/n)?: ");
            answer = br.readLine();

        } while (answer.equalsIgnoreCase("y"));

        studentService.printStudentInfo(students);

        System.out.print("A: ");
        System.out.print(studentService.getPercentByScore(students, "C") + "%");
    }

    public static void main(String[] args) throws IOException {

        new Application().solve();
    }
}
