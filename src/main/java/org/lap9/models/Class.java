package org.lap9.models;

import lombok.Getter;
import lombok.Setter;
import org.lap9.services.StudentService;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Class {

    private final String subjectName;
    private final List<Student> students;

    public Class(String subjectName) {

        this.subjectName = subjectName;
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        if (student == null) return;
        boolean oke = students.add(student);;

        System.out.println("Successfully added student.");
    }

    public void removeStudent(int id) {
        boolean oke = students.removeIf(o -> o.getId() == id);
        if (!oke) {
            System.out.println("Student not found.");
            return;
        }
        System.out.println("Successfully removed student.");
    }

    public Student findStudentByID(int id) {
        return students.stream()
                .filter(o -> o.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void updateAcademicAbilityOfStudent(int id, String academicAbility) {
        StudentService sService = StudentService.getInstance();
        Student student = findStudentByID(id);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        sService.updateAcademicAbilityOfStudent(student, academicAbility);
        System.out.println("Successfully updated academic ability of student.");
    }
}
