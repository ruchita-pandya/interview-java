package com.example.corejava.stringdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConcat {

    public static void main(String[] args) {
        String s1="Hello";
        String s2="java";

        System.out.println(80+ 10+"hello"+"java"+80+90);
        System.out.println(s1.concat(s2));
        System.out.println(String.join("<","tata","bye","bye"));
        System.out.println(String.format("hello java %s!","good"));

        List<String> strings= Arrays.asList("mumbai","pune","goa");
        String s=strings.stream().collect(Collectors.joining("->"));
        System.out.println(s);

    }



}
