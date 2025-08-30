package com.example.corejava.stringdemo;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {
        String s1="Listen";
        String s2="silent";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] c1=s1.toCharArray();
        Arrays.sort(c1);
        char[] c2=s2.toCharArray();
        Arrays.sort(c2);
        s1=Arrays.toString(c1);
        s2=Arrays.toString(c2);
        if(s1.equals(s2)){
            System.out.println("anagram");
        }
        else {
            System.out.println("not");
        }
    }
}
