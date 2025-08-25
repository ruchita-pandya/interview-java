package com.example.corejava.javabasics;

import java.util.Scanner;

public class VowelOrConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character");
        char c=sc.next().toLowerCase().charAt(0);
        switch (c){
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                 System.out.println("vowel");
                 break;
            default:
                System.out.println("consonant");

        }

    }
}
