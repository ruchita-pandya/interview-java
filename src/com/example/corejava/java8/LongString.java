package com.example.corejava.java8;

import java.util.Arrays;
import java.util.List;

public class LongString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","core","Springboot","spring","Hibernate");
        String string=list.stream().map(a->a.toLowerCase()).reduce((a,b)->a.length()>b.length()?a:b).get();
        System.out.println(string);
    }

}
