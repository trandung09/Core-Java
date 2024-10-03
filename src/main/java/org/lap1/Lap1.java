package org.lap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lap1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String name, email, subject;
        int age;

        boolean emailVerified, ageVerified;

        System.out.print("Enter your name: ");
        name = br.readLine();
        do {
            System.out.print("Enter your age: ");
            age = Integer.parseInt(br.readLine());

            ageVerified = age > 0 && age < 100;

            if (!ageVerified) {
                System.out.println("Please enter your age between 1 and 99!");
            }

        } while (!ageVerified);

        System.out.print("Enter your subject: ");
        subject = br.readLine();

        do {
            System.out.print("Enter your email: ");
            email = br.readLine();

            emailVerified = email.endsWith("@gmail.com");

            if (!emailVerified) {
                System.out.println("Please enter email in correct format!");
            }

        } while (!emailVerified);

        System.out.printf("\nYour info: \n\t\tname: %s\n\t\tage: %d\n\t\tsubject: %s\n\t\temail: %s\n"
                    , name, age, subject, email);
    }
}

