package org.lap9.bttl2.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.lap9.bttl2.ClassManager;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class School {

    private String name;
    private List<ClassManager> classes;

    public School(String name) {
        this.name = name;
        this.classes = new ArrayList<>();
    }
}
