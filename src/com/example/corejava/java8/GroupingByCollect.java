package com.example.corejava.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByCollect {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(2,1,4,2,3,2,1,1,3,3,3,4);
        Map<Integer, Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

        List<String> strings=Arrays.asList("Aman","cool","Ritu","kabir","rohan");
        Map<Integer,List<String>> map1=strings.stream().collect(Collectors.groupingBy(a->a.length()));
        System.out.println(map1);

        Map<Boolean,List<Integer>> map2=list.stream().collect(Collectors.partitioningBy(a->a%3==0));
        System.out.println(map2);



    }
}
