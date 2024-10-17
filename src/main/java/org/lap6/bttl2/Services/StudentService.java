package org.lap6.bttl2.Services;

import java.io.BufferedReader;
import java.io.IOException;

public abstract class StudentService {

    public static double setScore(String subject, BufferedReader br) throws IOException {
        double score = 0;
        do {
            System.out.print("Nhap diem " + subject +": ");
            score = Double.parseDouble(br.readLine());

            if (score < 0 || score > 10) {
                System.out.println("Hay nhap diem > 0 va <= 10.");
            }
        } while(score < 0 || score > 10);
        return score;
    }
}
