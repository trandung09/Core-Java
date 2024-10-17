package org.lap6.bttl2.Services;

import org.lap6.bttl2.models.BizStudent;
import org.lap6.bttl2.models.ITStudent;
import org.lap6.bttl2.models.TechmasterStudent;

import java.io.BufferedReader;
import java.io.IOException;

public class TechmasterStudentService {

    private TechmasterStudentService() {
    }

    public TechmasterStudent getStudent(String branch, BufferedReader br) throws IOException {
        return switch (branch.toLowerCase()) {
            case "it" -> ITStudentService.getStudent(br);
            case "biz" -> BizStudentService.getStudent(br);
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

    public static TechmasterStudentService getInstance() {
        return SingletonStudentServiceHolder.INSTANCE;
    }

    private static class SingletonStudentServiceHolder {
        private static final TechmasterStudentService INSTANCE = new TechmasterStudentService();
    }
}
