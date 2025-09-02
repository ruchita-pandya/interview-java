package com.example.corejava.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSort {
    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("Ravi",32);
        map1.put("Mohan",12);
        map1.put("Ankit",23);
        map1.put("Manoj",30);
        map1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        System.out.println("===============");





        Map<Manager,Integer> map = new HashMap<>();
        map.put(new Manager(200000,30,"pranav"),20);
        map.put(new Manager(400000,23,"amit"),23);
        map.put(new Manager(700000,29,"rohan"),2);
        map.put(new Manager(100000,12,"ravi"),123);

        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Manager::getSalary))).forEach(System.out::println);

    }
}
