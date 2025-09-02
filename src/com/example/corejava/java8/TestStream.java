package com.example.corejava.java8;

import java.util.Arrays;
import java.util.List;

public class TestStream {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        Integer min=list.stream().min((a,b)->a-b).get();

        System.out.println(min);
        Integer max=list.stream().max((a,b)->a-b).get();
        System.out.println(max);
    }
}
