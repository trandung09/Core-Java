package org.lap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lap2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n, mul = 1, sum = 0;

        do {
            System.out.print("Nhập số n: ");
            n = Integer.parseInt(br.readLine());

            if (n < 0)
                System.out.println("Hãy nhập n > 0.");

        } while (n < 0);

        // Tính tích các số từ 1 -> n
        for (int i = 1; i <= n; i++) {
                mul *= i;
        }

        System.out.println("Tích từ 1 đến n = " + mul);

        // Tính tổng các số chẵn trong khoảng từ 0 đến n
        n = (int)(1.0 * n / 2) * 2;
        while (n > 1) {
            sum += n;
            n -= 2;
        }

        System.out.println("Tổng các số chẵn trong khoảng 0 đến n = " + sum);
    }
}
