package com.example.corejava.java8;

import java.util.*;

public class IterateStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.forEach(a -> System.out.println(a));
        System.out.println("=========");
        list.stream().forEach(System.out::println);
        System.out.println("===========");
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "One");
        map.put(3, "three");
        map.put(2, "two");
        map.forEach((k, v) -> System.out.println("key=" + k + " value=" + v));
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(a -> System.out.println(a));
    }

}
