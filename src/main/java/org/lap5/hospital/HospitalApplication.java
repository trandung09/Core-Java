package org.lap5.hospital;

public class HospitalApplication {

    public static void main(String[] args) {

        HospitalManager hospitalManager = new HospitalManager();

        hospitalManager.allDoctorInformation();
        hospitalManager.allPatientInformation();
    }
}
