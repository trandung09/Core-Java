package org.lap9.bttl2.services;

import org.lap9.bttl2.models.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentService {

    private StudentService() {}

    public Student getStudent(BufferedReader br) throws IOException {
        System.out.print("Enter student name: ");
        String name = br.readLine();
        System.out.print("Enter student birth date: ");
        String birthDate = br.readLine();
        System.out.print("Enter student address: ");
        String address = br.readLine();

        return new Student(name, LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("d-M-yy")), address);
    }

    public static StudentService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final StudentService INSTANCE = new StudentService();
    }
}
