package com.example.corejava.javabasics;

import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks");

        int marks=sc.nextInt();

        if(marks<50){
            System.out.println("you are failed");
        } else if (marks>=50 && marks< 60) {
            System.out.println("grade =D");
        } else if (marks>=60 && marks<70) {
            System.out.println("grade = C");
        } else if(marks>=70 && marks<=100){
            System.out.println("grade =A");
        }else{
            System.out.println("invalid entry");
        }
    }
}
