package com.example.corejava.stringdemo;

public class Program1 {
    public static void main(String[] args) {
        String s1="Madam";
        s1=s1.toLowerCase();
        StringBuilder builder=new StringBuilder(s1);
        String s2=builder.reverse().toString();
        if(s1.equals(s2)) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not");
        }

    }
}
