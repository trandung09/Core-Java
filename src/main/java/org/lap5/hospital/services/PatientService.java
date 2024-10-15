package org.lap5.hospital.services;

import org.lap5.hospital.models.Patient;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PatientService {

    public PatientService() {
    }

    public Patient getPatient(BufferedReader br) throws IOException {

        System.out.print("Enter patient name: ");
        String name = br.readLine();
        System.out.print("Enter patient age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.print("Enter patient medical record number: ");
        int medicalRecordNumber = Integer.parseInt(br.readLine());
        System.out.print("Enter patient hospitalization date: ");
        String hospitalizationDate = br.readLine();

        return new Patient(name, age, medicalRecordNumber, hospitalizationDate);
    }
}
