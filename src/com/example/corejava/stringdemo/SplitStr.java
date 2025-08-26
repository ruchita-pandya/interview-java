package com.example.corejava.stringdemo;

public class SplitStr {
    public static void main(String[] args) {
        String s="Alpha,Beta,gama,sigma";
        String[] s1=s.split(",",0);

        for(String string:s1){
            System.out.println(string);
        }
    }

}
