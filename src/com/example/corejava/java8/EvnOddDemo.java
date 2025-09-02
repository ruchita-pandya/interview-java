package com.example.corejava.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvnOddDemo {
    //Sum even and odd numbers in a list using streams

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        int evenSum=list.stream().filter(a->a%2==0).mapToInt(a->a).sum();
        int oddSum=list.stream().filter(a->a%2!=0).mapToInt(a->a).sum();

        System.out.println("evenSum="+evenSum+" "+"oddSum="+oddSum);


    }
}
