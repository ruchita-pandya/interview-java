package com.example.corejava.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortString {
    public static void main(String[] args) {
        List<String> strings= Arrays.asList("banana","apple","orange","kiwi");
        List<String> asc=strings.stream().sorted().collect(Collectors.toList());
        List<String> desc=strings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(asc);
        System.out.println(desc);
    }
}
