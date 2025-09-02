package com.example.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectDemo {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("sre","admin","manager");
        StringBuilder string=list.stream().parallel().collect(StringBuilder::new,(a,b)->a.append(b),(a,b)->a.append(",").append(b));
        System.out.println(string);

    }



}
