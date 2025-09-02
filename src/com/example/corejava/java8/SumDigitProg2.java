package com.example.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumDigitProg2 {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(123,456,789);

        List<Integer> list1=list.stream()
                .map(a->String.valueOf(a))
                .map(str->str.chars().map(Character::getNumericValue).sum()).collect(Collectors.toList());
    }
}
