package org.lap9.bttl2.services;

import org.lap9.bttl2.models.Class;

import java.io.BufferedReader;
import java.io.IOException;

public class ClassService {

    private ClassService() {}

    public Class getClass(BufferedReader br) throws IOException {
        System.out.print("Enter class course: ");
        String className = br.readLine();
        System.out.print("Enter class semester: ");
        String semester = br.readLine();

        return new Class(className, semester);
    }

    public static ClassService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final ClassService INSTANCE = new ClassService();
    }
}
