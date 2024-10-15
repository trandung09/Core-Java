package org.lap5.hospital.services;

import org.lap5.hospital.models.Doctor;

import java.io.BufferedReader;
import java.io.IOException;

public class DoctorService {

    public DoctorService() {
    }

    public Doctor getDoctor(BufferedReader br) throws IOException {

        System.out.print("Enter doctor name: ");
        String name = br.readLine();
        System.out.print("Enter doctor age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.print("Enter doctor specialized: ");
        String specialized = br.readLine();
        System.out.print("Enter doctor working hours : ");
        int workingHours = Integer.parseInt(br.readLine());

        return new Doctor(name, age, specialized, workingHours);
    }
}
