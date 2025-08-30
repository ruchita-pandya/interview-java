package com.example.corejava.collectiondemo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxedMethod {
    public static void main(String[] args) {
        List<Integer> list=IntStream.of(2,4,5,6).boxed().collect(Collectors.toList());
        System.out.println(list);
    }
}
