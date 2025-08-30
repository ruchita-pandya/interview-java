package com.example.corejava.stringdemo;

import java.util.LinkedHashSet;

public class Program3 {
    public static void main(String[] args) {
        String s1="java";
        char[] c=s1.toCharArray();
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        StringBuilder builder=new StringBuilder();
        for(char c1:c){
            set.add(c1);
            //builder.append(set.)
        }
        for (char c2:set){
            builder.append(c2);
        }
        System.out.println(builder.toString());
    }
}
