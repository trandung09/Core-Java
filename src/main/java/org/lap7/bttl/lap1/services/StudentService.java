package org.lap7.bttl.lap1.services;

import org.lap7.bttl.lap1.models.Student;

import java.io.BufferedReader;
import java.io.IOException;

public class StudentService {

    public Student getStudent(BufferedReader br) throws IOException {

        System.out.println("Nhap ten sinh vien: ");
        String name = br.readLine();
        System.out.println("Nhap tuoi sinh vien: ");
        int age = Integer.parseInt(br.readLine());

        return new Student(name, age);
    }

    public static StudentService getInstance() {
        return new StudentService();
    }

    private static class SingletonHolder {
        private static final StudentService INSTANCE = new StudentService();
    }
}
