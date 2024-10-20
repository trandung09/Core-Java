package org.lap8.lap3_4.lap4.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdministrativeEmployee extends Employee {

    public AdministrativeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "AdministrativeEmployee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
