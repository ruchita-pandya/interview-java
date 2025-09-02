package com.example.corejava.java8;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {

        int[] a={1,2,4,5,2,5,5,5,6};

        List<Integer> listK=Arrays.asList(1,2,4,5,2,5,5,5,6);
        int first=listK.indexOf(5);
        int last=listK.lastIndexOf(5);

        System.out.println("first="+first+"last"+last);

        System.out.println("===============");

        List<Integer> list= Arrays.asList(2,1,3,6,4);
        List<Integer> list1=list.stream().filter((i)->i%2==0).collect(Collectors.toList());
        System.out.println(list1);

        List<String> strings=Arrays.asList("Mohan","Mohit","Anuj","Jay");
        List<String> strings1=strings.stream().filter(i->i.startsWith("M")).collect(Collectors.toList());
        System.out.println(strings1);



    }

}
