package org.lap5.hospital;

import org.lap5.hospital.models.Doctor;
import org.lap5.hospital.models.Patient;

import java.util.List;

public class HospitalManager {

    private final List<Doctor> doctors = List.of(
            new Doctor("a", 25, "maxillofacial", 8),
            new Doctor("b", 55, "obstetrics", 8),
            new Doctor("c", 40, "Department of Orthopedics", 8)
            );

    private final List<Patient> patients = List.of(
            new Patient("d", 28, 1, "12-8-2023"),
            new Patient("e", 60, 2, "20-11-2023"),
            new Patient("g", 55, 3, "22-8-2024"),
            new Patient("h", 48, 4, "17-5-2023"),
            new Patient("k", 76, 5, "11-11-2022")
            );

    public HospitalManager() {
    }

    public boolean addDoctor(Doctor doctor) {
        if (doctor == null) {
            return false;
        }
        return doctors.add(doctor);
    }

    public boolean addPatient(Patient patient) {
        if (patient == null) {
            return false;
        }
        return patients.add(patient);
    }


    public void allDoctorInformation() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors found");
            return;
        }
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }

    public void allPatientInformation() {
        if (patients.isEmpty()) {
            System.out.println("No patients found");
            return;
        }
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }
}
