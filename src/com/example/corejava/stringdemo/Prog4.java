package com.example.corejava.stringdemo;

import java.util.Arrays;

public class Prog4 {
    //reversing a single word in sentence
    public static void main(String[] args) {
        String s="hey how are you java";
        String s1[]=s.split(" ");
        String word="java";
StringBuilder builder=new StringBuilder(word);
builder.reverse();
        //System.out.println(s1[0]);

for(int i=0;i<s1.length;i++){
    if(s1[i].equals(word))
        s1[i]= builder.toString();

        }
        String result = String.join(" ", s1);

        System.out.println(result);

    }
}
