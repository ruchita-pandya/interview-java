package com.example.corejava.javabasics;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int no=sc.nextInt();
        String month;
        switch (no){
            case 1:
                month="Jan -1";
                break;
            case 2:
                month="feb =2";
                break;
            case 3:
                month="march -3";
                break;
            default:
                month="invalid";

        }
        System.out.println(month);
    }
}
