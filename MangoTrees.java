package com.company;

import java.util.Scanner;

public class MangoTrees {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int col=s.nextInt();
        int row=s.nextInt();
        int n=s.nextInt();
        if(n>col*row)
        {
            System.out.print("Invalid input");
            System.exit(0);
        }
        if((n%col==0) || (n%col == 1) || (n<row))
            System.out.print("Mango tree!");
        else
        System.out.print("Not a mango tree!");
    }
}
