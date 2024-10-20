package org.lap7.bttl3.services;

import org.lap7.bttl3.models.Song;

import java.io.BufferedReader;
import java.io.IOException;

public class SongService {

    private SongService() {}

    public Song getSong(BufferedReader br) throws IOException {
        return null;
    }

    public static SongService getInstance() {
        return SongService.SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final SongService INSTANCE = new SongService();
    }
}
