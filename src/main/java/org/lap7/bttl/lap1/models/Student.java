package org.lap7.bttl.lap1.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Student {

    private static int AUTO_INCREMENT_ID = 0;

    private int id;
    private String name;
    private int age;

    public Student(String name, int age) {

        this.id = AUTO_INCREMENT_ID++;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
