package org.lap8.lap3_4.lap3.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Worker {

    private static int AUTO_INCREMENT_ID = 0;

    private final int id;
    private int age;
    private String name;
    private double salary;
    private String workPlace;

    public Worker(String name, int age, double salary, String workPlace) {

        this.id = AUTO_INCREMENT_ID++;

        this.age = age;
        this.name = name;
        this.salary = salary;
        this.workPlace = workPlace;
    }
}
