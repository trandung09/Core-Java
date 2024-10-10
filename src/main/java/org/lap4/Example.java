package org.lap4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {

    public static void printOutArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
        System.out.println();

        for (int val : arrays) {
            System.out.print(val + " ");
        }
    }

    public static int multiply(int n) {
        int res = 1;
        if (n == 0) return 0;
        for (int i = 1; i <= n; i++) {
            res *= n;
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arrays = new int[n];
        for (int i = 0; i < n; i++) {
            arrays[i] = Integer.parseInt(br.readLine());
        }

        Example.printOutArray(arrays);
        System.out.println();
        System.out.println(Example.multiply(n));
    }
}
