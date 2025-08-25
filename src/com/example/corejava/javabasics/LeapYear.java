package com.example.corejava.javabasics;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year");
        int yr=sc.nextInt();

        if(yr%400==0){
            System.out.println("its a leap year");
        } else if (yr%4==0 && yr %100!=0) {
            System.out.println("its a leap year");
        }
        else{
            System.out.println("given no is not leap year");
        }

    }
}
