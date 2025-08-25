package com.example.corejava.operatordemo;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        //swap two number using temp
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first no");
        int a=sc.nextInt();

        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
sc.close();
    }
}
