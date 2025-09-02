package com.example.corejava.java8;

import java.util.Arrays;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
        int min= list.stream().mapToInt(a->a).min().getAsInt();
        int max= list.stream().mapToInt(a->a).max().getAsInt();

        System.out.println(min);
        System.out.println(max);


    }
}
