package com.company;

import java.util.Scanner;

public class ArrayType {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int array[] = new int[arraySize];
        String typesOfArrays[] = {"Even", "Odd", "Mixed"};
        for (int i = 0; i < arraySize; i++)
            array[i] = scanner.nextInt();
        System.out.println("The array is " + typesOfArrays[findType(array, arraySize) - 1]);
    }

    static int findType ( int array[], int arraySize ) {
        int flag = 0;
        for (int i = 0; i < arraySize; i++) {
            if (array[i] % 2 == 0)
                flag++;
        }
        if (flag == 0)
            return 2;
        if (flag < arraySize)
            return 3;
        return 1;
    }
}
