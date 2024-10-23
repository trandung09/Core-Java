package org.lap9.bttl2;

import org.lap9.bttl2.models.School;
import org.lap9.bttl2.services.SchoolService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private final SchoolManager schoolManager = SchoolManager.getInstance();
    private final SchoolService schoolService = SchoolService.getInstance();

    public void application() throws IOException {

        School school = schoolService.getSchool(br);

        schoolManager.setSchool(school);


    }

    public static void main(String[] args) {

    }
}
