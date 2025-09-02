package com.example.corejava.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<Customers> list=new ArrayList<>();
        list.add(new Customers("Ravi",56, Arrays.asList(234242,435322)));
        list.add(new Customers("Mohan",32, Arrays.asList(424222,534252)));
        list.add(new Customers("Anuj",23, Arrays.asList(4241133,564332)));

        List<String> strings=list.stream().map(a->a.getName().toLowerCase()).collect(Collectors.toList());
        System.out.println(strings);
        System.out.println("==============");
        List<Integer> phoneNo=list.stream().flatMap(a->a.getPhoneno().stream()).collect(Collectors.toList());
        System.out.println(phoneNo);
    }



}
