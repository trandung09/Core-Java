package org.lap3.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixAddition {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int col1, col2, row1, row2;

        while (true) {
            System.out.print("Nhập số hàng ma trận 1: ");
            row1 = Integer.parseInt(br.readLine());
            if (row1 <= 0)
                System.out.println("Hãy nhập số hàng lớn hơn 0.");
            else break;
        }

        while (true) {
            System.out.print("Nhập số cột ma trận 1: ");
            col1 = Integer.parseInt(br.readLine());
            if (col1 <= 0)
                System.out.println("Hãy nhập số cột lớn hơn 0.");
            else break;
        }
        int[][] matrix1 = new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            System.out.printf("Nhập %d phần tử hàng %d: ", col1, i + 1);
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < col1; j++) {
                matrix1[i][j] = Integer.parseInt(line[j]);
            }
        }

        System.out.println();
        while (true) {
            System.out.print("Nhập số hàng ma trận 2: ");
            row2 = Integer.parseInt(br.readLine());
            if (row2 <= 0)
                System.out.println("Hãy nhập số hàng lớn hơn 0.");
            else break;
        }

        while (true) {
            System.out.print("Nhập số cột ma trận 2: ");
            col2 = Integer.parseInt(br.readLine());
            if (col2 <= 0)
                System.out.println("Hãy nhập số cột lớn hơn 0.");
            else break;
        }
        int[][] matrix2 = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            System.out.printf("Nhập %d phần tử hàng %d: ", col2, i + 1);
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < col2; j++) {
                matrix2[i][j] = Integer.parseInt(line[j]);
            }
        }

        System.out.println();
        if (row1 != row2 || col1 != col2) {
            System.out.println("Không thể cộng 2 ma trận.");
        }
        else {
            int[][] matrix3 = new int[row1][col1];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            System.out.println("Tổng 2 ma trận là: ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    System.out.print(matrix3[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
