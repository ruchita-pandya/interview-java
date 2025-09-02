package com.example.corejava.java8;

import java.util.Arrays;
import java.util.List;

public class LastElement {
    //Find the last element in a list using streams
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        int last=list.stream().skip(list.size()-1).findFirst().get();
        System.out.println(last);
        int secondlast=list.stream().skip(list.size()-2).findFirst().get();
        System.out.println(secondlast);
    }
}
