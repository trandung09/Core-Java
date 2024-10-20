package org.lap7.bttl3.services;

import org.lap7.bttl3.models.Follower;

import java.io.BufferedReader;
import java.io.IOException;

public class FollowerService {

    private FollowerService() {}

    public Follower getFollower(BufferedReader br) throws IOException {
        return null;
    }

    public static FollowerService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final FollowerService INSTANCE = new FollowerService();
    }
}
