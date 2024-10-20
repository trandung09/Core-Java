package org.lap7.bttl3.services;

import org.lap7.bttl3.models.Idol;

import java.io.BufferedReader;
import java.io.IOException;

public class IdolService {

    private IdolService() {}

    public Idol getIdol(BufferedReader br) throws IOException {
        return null;
    }

    public static IdolService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final IdolService INSTANCE = new IdolService();
    }
}
