package com.example.corejava.collectiondemo;

import java.util.*;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);

        System.out.println("get function="+map);

        /*System.out.println(map);*/
//map.entrySet().forEach(System.out::println);

       /* for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println("key="+entry.getKey()+" Value= "+entry.getValue());
        }*/
/*
        for(String i: map.keySet()){
            System.out.println(i);
        }
        System.out.println("values");
        for(Integer i: map.values()){
            System.out.println(i);
        }*/
/*
        Iterator<Map.Entry<String,Integer>> iterator=map.entrySet().iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        Map<String,Integer> map1=map.entrySet().stream().collect(Collectors.toMap(a->a.getKey(),a-> a.getValue()));
        System.out.println(map1);
    }

}

