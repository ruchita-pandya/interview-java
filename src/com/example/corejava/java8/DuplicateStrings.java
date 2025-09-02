package com.example.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateStrings {
    public static void main(String[] args) {
        List<String> strings= Arrays.asList("Aman","cool","Ritu","kabir","rohan","rohan","cool");
        Map<String, Long> map=strings.stream().map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

    }
}
