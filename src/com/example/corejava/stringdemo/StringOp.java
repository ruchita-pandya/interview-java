package com.example.corejava.stringdemo;

public class StringOp {

    public static void main(String[] args) {
        String str="hello java";
        String s1="Hello";
        String s2="hello";
        System.out.println(str.startsWith("hel"));
        System.out.println(str.endsWith("ava"));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
    }
}
