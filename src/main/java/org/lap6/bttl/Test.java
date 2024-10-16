package org.lap6.bttl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Nhap quang duong: ");
        double dist = Double.parseDouble(br.readLine());

        Vehicle bus = new Bus();
        Vehicle plane = new Plane();
        Vehicle train = new Train();

        System.out.println("Thoi gian xe bus chay: " + bus.getTime(dist) + "h");
        System.out.println("Thoi gian xe tau chay: " + train.getTime(dist) + "h");
        System.out.println("Thoi gian may bay chay: " + plane.getTime(dist) + "h");
    }
}
