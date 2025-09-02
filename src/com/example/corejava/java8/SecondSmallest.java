package com.example.corejava.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondSmallest {
    public static void main(String[] args) {
       // Find the second smallest or largest element in a list
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
        int secondMin=list.stream().sorted().skip(1).findFirst().get();
        System.out.println(secondMin);
        int secondmax=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondmax);
    }
}
