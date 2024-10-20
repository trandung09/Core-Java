package org.lap7.bttl.lap3.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Worker {

    private static int AUTO_INCREMENT_ID = 0;

    private int id;
    private String name;
    private String workPlace;
    private int age;
    private double salary;

    public Worker(String name, int age, String workPlace, double salary) {

        this.id = AUTO_INCREMENT_ID++;

        this.name = name;
        this.workPlace = workPlace;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", workPlace='" + workPlace + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
