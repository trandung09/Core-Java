package org.lap9.bttl2;

import lombok.Getter;
import lombok.Setter;
import org.lap9.bttl2.models.School;
import org.lap9.bttl2.models.Student;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class SchoolManager {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private School school;

    private SchoolManager() {
        school = new School();
    }

    public void addStudent(String course, Student student) {
        if (student == null) return;

        ClassManager clazzManager = findClassByCourse(course);
        if (clazzManager == null) {
            System.out.println("Class not found");
            return;
        }

        clazzManager.addStudent(student);
        System.out.println("Successfully added student .");
    }

    public ClassManager findClassByCourse(String course) {
        return school.getClasses()
                .stream()
                .filter(o -> o.getClazz().getCourse().equalsIgnoreCase(course))
                .findFirst()
                .orElse(null);
    }

    public ArrayList<Student> findStudentsByBirthAndAddress(String birth, String address) {
        List<ClassManager> classManagers = school.getClasses();
        ArrayList<Student> students = new ArrayList<>();

        for (ClassManager classManager : classManagers) {
            students.addAll(classManager.findStudentByBirthAndAddress(birth, address));
        }

        return students;
    }

    public static SchoolManager getInstance() {
        return SchoolManager.SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final SchoolManager INSTANCE = new SchoolManager();
    }
}
