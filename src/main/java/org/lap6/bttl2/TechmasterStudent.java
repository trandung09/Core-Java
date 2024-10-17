package org.lap6.bttl2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class TechmasterStudent {

    protected String name;
    protected String branch;

    public abstract double getScore();

    public void printAllInfo() {
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
    }
}
