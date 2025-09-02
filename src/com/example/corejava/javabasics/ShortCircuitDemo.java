package com.example.corejava.javabasics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShortCircuitDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6,7);
        boolean allmatch=list.stream().allMatch(a->a>4);
        System.out.println("allmatch="+allmatch);
        boolean anyMatch=list.stream().anyMatch(a->a>4);
        System.out.println("anyMatch="+anyMatch);
        boolean noneMatch=list.stream().noneMatch(a->a>4);
        System.out.println("noneMatch"+noneMatch);
    }
}
