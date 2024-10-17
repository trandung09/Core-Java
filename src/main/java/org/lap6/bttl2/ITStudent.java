package org.lap6.bttl2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ITStudent extends TechmasterStudent {

    private double javaScore, htmlScore, cssScore;

    public ITStudent(String name, String branch, double javaScore, double htmlScore, double cssScore) {
        super(name, branch);
        this.javaScore = javaScore;
        this.htmlScore = htmlScore;
        this.cssScore = cssScore;
    }

    public ITStudent() {
    }

    @Override
    public double getScore() {
        return (javaScore * 2  + htmlScore + cssScore) / 4;
    }

    @Override
    public void printAllInfo() {
        super.printAllInfo();
        System.out.println("Java Score: " + javaScore);
        System.out.println("HTML Score: " + htmlScore);
        System.out.println("CSS Score: " + cssScore);
    }
}
