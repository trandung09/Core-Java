package org.lap9.bttl1.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

    private static int AUTO_INCREMENT_ID = 0;

    private final int id;
    private int age;
    private String name;
    private String academicAbility;

    public Student(String name, int age, String academicAbility) {

        this.id = AUTO_INCREMENT_ID++;

        this.age = age;
        this.name = name;
        this.academicAbility = academicAbility;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", academicAbility='" + academicAbility + '\'' +
                '}';
    }
}
