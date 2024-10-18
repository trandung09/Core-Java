package org.lap7.test;


import org.lap7.records.Car;

public class Test {

    public static void main(String[] args) {


        var test_case = 1;
        var n = switch (test_case) {
            case 1 -> {
                yield 10;
            }
            case 2 -> 20;
            default -> 100;
        };

        System.out.println(n);

        var car = new Car("A", "B", "C");
        System.out.println(car.name());
    }
}
