package com.example.corejava.stringdemo;
public class ReverseString {

    public static void main(String[] args) {

        // Declare original string variable
        String a = "Geeks";

        String b = "";

        for (int i = a.length() - 1; i >= 0; i--) {

            char ch = a.charAt(i);
            //String ch1 = Character.toString(ch);
            b = b.concat(String.valueOf(ch));
        }

        System.out.println("" + a);
        System.out.println("" + b);
    }
}
