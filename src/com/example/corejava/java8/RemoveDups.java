package com.example.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDups {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,2,3,4,3,4,4,4,4);
        Set<Integer> list1=list.stream().collect(Collectors.toSet());
        System.out.println(list1);
    }
}
