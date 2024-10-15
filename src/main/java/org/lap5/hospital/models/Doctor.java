package org.lap5.hospital.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Doctor extends Person {

    private String specialized;
    private int workingHours;

    public Doctor(String name, int age, String specialized, int workingHours) {
        super(name, age);
        this.specialized = specialized;
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "specialized='" + specialized + '\'' +
                ", workingHours=" + workingHours +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
