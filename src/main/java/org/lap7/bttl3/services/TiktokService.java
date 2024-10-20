package org.lap7.bttl3.services;

import org.lap7.bttl3.models.Tiktok;

import java.io.BufferedReader;
import java.io.IOException;

public class TiktokService {

    private TiktokService() {}

    public Tiktok getTiktok(BufferedReader br) throws IOException {
        return null;
    }

    public static TiktokService getInstance() {
        return TiktokService.SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final TiktokService INSTANCE = new TiktokService();
    }
}
