package org.lap9.bttl2.services;

import org.lap9.bttl2.models.School;

import java.io.BufferedReader;
import java.io.IOException;

public class SchoolService {

    private SchoolService() {}

    public School getSchool(BufferedReader br) throws IOException {
        System.out.print("Enter school name: ");
        String name = br.readLine();

        return new School(name);
    }

    public static SchoolService getInstance() {
        return SchoolService.SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final SchoolService INSTANCE = new SchoolService();
    }
}
