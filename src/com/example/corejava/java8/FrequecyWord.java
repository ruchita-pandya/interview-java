package com.example.corejava.java8;

import java.util.*;

public class FrequecyWord {
    //Count the frequency of each word in a list of strings
    public static void main(String[] args) {
        List<String> strings= Arrays.asList("Amit","keval","Amit","keval");
        Set<String> strings1=new HashSet<>(strings);
        for (String s:strings1){
            System.out.println(s+"="+ Collections.frequency(strings,s));
        }



    }
}
