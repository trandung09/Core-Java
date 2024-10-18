package org.lap7.bttl.lap2.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Student {

    private static int INCREMENT_ID = 0;

    private int id;
    private String name;
    private double scoreMath, scorePhysic, scoreChemistry;

    public Student(String name, double scoreMath, double scorePhysic, double scoreChemistry) {
        this.id = INCREMENT_ID++;
        this.scoreMath = scoreMath;
        this.name = name;
        this.scorePhysic = scorePhysic;
        this.scoreChemistry = scoreChemistry;
    }
}
