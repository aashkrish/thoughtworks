package com.company;

import java.util.Scanner;

public class MangoTrees {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int column=s.nextInt(); //Number of columns in Dora's garden
        int row=s.nextInt(); //Number of rows in Dora's garden
        int TreeNumber=s.nextInt();
        if(TreeNumber>column*row)
        {
            System.out.print("Invalid input");
            System.exit(0);
        }
        if((TreeNumber%column==0) || (TreeNumber%column == 1) || (TreeNumber <=row))
            System.out.print("Mango tree!");
        else
        System.out.print("Not a mango tree!");
    }
}
