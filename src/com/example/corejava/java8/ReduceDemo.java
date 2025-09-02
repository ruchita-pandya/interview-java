package com.example.corejava.java8;

import java.util.*;

public class ReduceDemo {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
         //sum=0;

         OptionalDouble avg = OptionalDouble.of(list.stream().mapToInt(a->a).average().getAsDouble());
        System.out.println(avg.getAsDouble());

    }

}
