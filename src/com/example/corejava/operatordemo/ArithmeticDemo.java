package com.example.corejava.operatordemo;

import java.util.Scanner;

public class ArithmeticDemo {

    public static void main(String[] args) {
        //swap two number using temp
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter first no");
        int a=sc.nextInt();
        System.out.printf("Enter second no");
        int b=sc.nextInt();
        int temp;

        temp=a;
        a=b;
        b=temp;

        System.out.println("swapped a:"+a);
        System.out.println("swapped b:"+b);


    }
}
