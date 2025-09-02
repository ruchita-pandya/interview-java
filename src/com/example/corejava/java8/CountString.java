package com.example.corejava.java8;

import java.util.Arrays;
import java.util.List;

public class CountString {
    //Count strings starting with a specific letter using streams
    public static void main(String[] args) {
        List<String> list= Arrays.asList("fly","flyer","flying");
        long count=list.stream().filter(a->a.startsWith("fly")).count();
        System.out.println(count);
    }
}
