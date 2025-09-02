package com.example.corejava.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalDemo2 {
    public static void main(String[] args) {
        List<String> list= Stream.of("Raju","Praveen","Kirti").collect(Collectors.toList());
        String name=list.stream().filter(a->a.startsWith("A")).findAny().orElse("Aman");
        System.out.println(name);
    }



}
