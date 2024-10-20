package org.lap7.bttl3.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Idol {

    private String name;
    private String email;
    private List<Follower> followers;
    private String group;
}
