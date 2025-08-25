package com.example.corejava.controlstatements;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int obj=sc.nextInt();
        int  endresult = 0;
        int fact=1;
        for(int i=1;i<=5;i++){

            fact=fact*i;
            //endresult=result;
        }
        System.out.println("factorial="+fact);
    }

}
