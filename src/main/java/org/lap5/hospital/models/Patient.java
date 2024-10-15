package org.lap5.hospital.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class Patient extends Person {

    private int medicalRecordNumber;
    private LocalDate hospitalizationDate;

    public Patient(String name, int age, int medicalRecordNumber, String hospitalizationDate) {
        super(name, age);
        this.medicalRecordNumber = medicalRecordNumber;
        this.hospitalizationDate = LocalDate.parse(hospitalizationDate, DateTimeFormatter.ofPattern("d-M-yyyy"));
    }

    @Override
    public String toString() {
        return "Patient[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", medicalRecordNumber=" + medicalRecordNumber +
                ", hospitalizationDate=" + hospitalizationDate +
                ']';
    }
}
