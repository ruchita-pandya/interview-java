package com.example.corejava.operatordemo;

import java.util.Scanner;

public class AvgNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int a=sc.nextInt();
        System.out.println("Enter no");
        int b=sc.nextInt();
        System.out.println("Enter no");
        int c=sc.nextInt();

        int sum=(a+b+c);
        double avg= sum/3.0;
        Math.round(avg);
        System.out.println("avg:" +avg);
    }

}
