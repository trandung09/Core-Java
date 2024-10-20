package org.lap8.lap3_4.lap4.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentManager extends Employee {

    private double otherSalary;

    public DepartmentManager(String name, double salary, double otherSalary) {
        super(name, salary);
        this.otherSalary = otherSalary;
    }

    @Override
    public String toString() {
        return "DepartmentManager{" +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                "otherSalary=" + otherSalary +
                '}';
    }
}
