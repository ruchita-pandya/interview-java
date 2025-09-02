package com.example.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStart {

    public static int numberFirst(int n){
        while(n>0){
            n=n/10;
        }
        return n;
    }
    //Filter numbers starting with a specific digit in a list
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(23,34,43,26,45);
        /*List<Integer> list1=list.stream()
                .filter(a->numberFirst(a)==2)
               // .mapToInt(a->a)
                .collect(Collectors.toList());

        */
        List<Integer> list1=list.stream().map(String::valueOf).filter(a->a.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
       // List<Integer> list2=list1.stream().map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(list1);
    }
}
