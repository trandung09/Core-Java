package org.lap6.bttl;

public abstract class Vehicle {

    protected double speed;

    public double getTime(double dist) {
        return dist / speed;
    }
}
