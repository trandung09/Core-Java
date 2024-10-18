package org.lap6;

public class Test {
    public static void main(String[] args) {
        Person vn = new Vietnamese();
        Person el = new England();

        vn.say();
        el.say();

        int[] arrs = new int[]{1,2, 3, 4, 5,6 , 7, 8, 9, 10};

        for (var i : arrs) {
            System.out.println(i);
        }

    }
}
