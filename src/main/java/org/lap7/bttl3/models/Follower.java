package org.lap7.bttl3.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Follower {

    private int id;
    private String name;
    private String email;
    private int numberOfLikes;
}
