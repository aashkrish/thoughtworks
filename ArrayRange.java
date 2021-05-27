package com.company;

import java.util.Scanner;

public class ArrayRange {

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int array[] = new int[arraySize];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("The range of the array is " + (max - min));
    }
}
