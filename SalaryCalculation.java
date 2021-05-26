package com.company;

import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int hoursWorked[]= new int[7];
        int totalHoursWorked=0, salary=0;
        for(int i=0; i<7; i++)
        {
            hoursWorked[i]=s.nextInt();
            if(i!=0 && i!=6)
            {
                totalHoursWorked+=hoursWorked[i];
                if(hoursWorked[i]>8)
                    salary+=(hoursWorked[i]-8)*15;
                salary+=hoursWorked[i]*100;
            }
            else if (i==0)
            {
                salary+=hoursWorked[i]*150;
            }
            else
                salary+=hoursWorked[i]*125;

        }
        if(totalHoursWorked>40)
            salary+= (totalHoursWorked-40)*25;
        System.out.print(salary);
    }
}
