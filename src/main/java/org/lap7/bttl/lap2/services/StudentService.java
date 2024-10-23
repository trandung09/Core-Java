package org.lap7.bttl.lap2.services;

import org.lap7.bttl.lap2.models.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentService {

    public Student getStudent(BufferedReader br) throws IOException {

        System.out.print("Nhap ten sinh vien: ");
        String name = br.readLine();
        System.out.print("Nhap diem toan: ");
        double mathScore = Double.parseDouble(br.readLine());
        System.out.print("Nhap diem vat ly: ");
        double physicScore = Double.parseDouble(br.readLine());
        System.out.print("Nhap diem hoa hoc: ");
        double chemicalScore = Double.parseDouble(br.readLine());
        return new Student(name, mathScore, physicScore, chemicalScore);
    }

    public double getStudentAvgScore(Student student) {
        return (student.getScoreMath() + student.getScorePhysic() + student.getScoreChemistry()) / 3;
    }

    public String getStudentRank(Student student) {
        if (getStudentAvgScore(student) < 6.5) return "C";
        else if (getStudentAvgScore(student) < 8.5) return "B";
        else return "A";
    }

    public void printStudentInfo(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", AvgScore: " + getStudentAvgScore(student));
        }
    }

    public double getPercentByScore(ArrayList<Student> students, String rank) {
        int count = 0;
        for (Student student : students) {
            String srank = getStudentRank(student);
            if (srank.equalsIgnoreCase(rank)) {
                count++;
            }
        }
        return (1.0 * count / students.size()) * 100;
    }

    public static StudentService getInstance() {
        return new StudentService();
    }

    private static class SingletonHolder {
        private static final StudentService INSTANCE = new StudentService();
    }
}
