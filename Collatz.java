package com.company;

import java.util.Scanner;

public class Collatz {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.println(number);
        while (number != 1) {

            if (number % 2 == 0)
                number /= 2;
            else
                number = 3 * number + 1;
            System.out.println(number);
        }
    }
}
