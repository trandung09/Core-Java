package org.lap6.bttl2.Services;

import org.lap6.bttl2.BizStudent;
import org.lap6.bttl2.ITStudent;
import org.lap6.bttl2.TechmasterStudent;

public class StudentService {

    public StudentService() {}

    public TechmasterStudent getStudent(String branch) {
        return switch (branch.toLowerCase()) {
            case "it" -> new ITStudent();
            case "biz" -> new BizStudent();
            default -> throw new IllegalStateException("Unexpected value: " + branch.toLowerCase());
        };
    }

    public String getRankOfStudent(TechmasterStudent student) {
        double score = 0;
        if (student instanceof ITStudent) {
            score = ((ITStudent) student).getScore();
        }
        if (student instanceof BizStudent) {
            score = ((BizStudent) student).getScore();
        }
        if (score < 5) return "Yeu";
        if (score < 6.5) return "Trung Binh";
        if (score < 8.5) return "Kha";
        else return "Gioi";
    }
}
