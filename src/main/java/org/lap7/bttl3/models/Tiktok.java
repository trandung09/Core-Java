package org.lap7.bttl3.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Tiktok {

    private List<Song> songs;
    private List<Idol> idols;

    public Tiktok() {
        this.songs = new ArrayList<>();
        this.idols = new ArrayList<>();
    }
}
