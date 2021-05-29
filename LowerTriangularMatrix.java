package com.company;

import java.util.Scanner;

public class LowerTriangularMatrix {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] array = new int[rows][columns];
        if (rows != columns) {
            System.out.println("No");
            System.exit(0);
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
                if (i + j > rows - 1 && array[i][j] != 0) {
                    System.out.println("No");
                    System.exit(0);
                }
            }
        }
        System.out.println("Yes");
    }
}