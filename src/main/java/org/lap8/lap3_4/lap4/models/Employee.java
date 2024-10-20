package org.lap8.lap3_4.lap4.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

    private static int AUTO_INCREMENT_ID = 0;

    protected final int id;
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.id = AUTO_INCREMENT_ID++;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
