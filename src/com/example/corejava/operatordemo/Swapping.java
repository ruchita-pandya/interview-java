package com.example.corejava.operatordemo;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        //swap two number using temp
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter first no");
        int a=sc.nextInt();
        System.out.printf("Enter second no");
        int b=sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("swapped a:"+a);
        System.out.println("swapped b:"+b);


    }
}
