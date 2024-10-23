package org.lap9.bttl1.services;

import org.lap9.bttl1.models.Student;

import java.io.BufferedReader;
import java.io.IOException;

public class StudentService {

    private StudentService() {}

    public Student getStudent(BufferedReader br) throws IOException {

        System.out.print("Enter student name: ");
        String name = br.readLine();
        System.out.print("Enter student age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.print("Enter student academic ability: ");
        String academicAbility = br.readLine();

        return new Student(name, age, academicAbility);
    }

    public void updateAcademicAbilityOfStudent(Student student, String academicAbility) {
        student.setAcademicAbility(academicAbility);
    }

    public static StudentService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final StudentService INSTANCE = new StudentService();
    }
}
