package com.example.corejava.java8;

import java.util.Arrays;
import java.util.List;

public class LazyEvaluation {
    public static void main(String[] args) {


        List<String> strings = Arrays.asList("one", "two", "three", "four");

        strings.stream()
                .filter(s -> {
                    System.out.println("Filter: " + s);
                    return s.length() > 3;
                })
                .map(s -> {
                    System.out.println("Map: " + s);
                    return s.toUpperCase();
                })
        .forEach(s -> System.out.println("Processed: " + s));
    }
}
