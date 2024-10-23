package org.lap9.bttl2;

import lombok.Getter;
import lombok.Setter;
import org.lap9.bttl2.models.Class;
import org.lap9.bttl2.models.Student;
import org.lap9.bttl2.services.ClassService;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Getter
@Setter
public class ClassManager {

    private Class clazz;

    public ClassManager() {

    }

    public void addStudent(Student student) {
        if (student == null) return;
        boolean ok = clazz.getStudents().add(student);
        System.out.println("Successfully added student.");
    }

    public ArrayList<Student> findStudentByAddress(String address) {
        return (ArrayList<Student>) clazz.getStudents()
                .stream()
                .filter(o -> o.getAddress().equalsIgnoreCase(address))
                .collect(Collectors.toList());
    }

    public ArrayList<Student> findStudentByBirthAndAddress(String birth, String address) {
        return (ArrayList<Student>) clazz.getStudents()
                .stream()
                .filter(o -> {
                    int year = Integer.parseInt(birth);
                    return o.getBirthDate().getYear() == year && o.getAddress().equalsIgnoreCase(address);
                }).collect(Collectors.toList());
    }
}
