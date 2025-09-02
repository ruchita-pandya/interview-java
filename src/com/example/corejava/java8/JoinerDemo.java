package com.example.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinerDemo {

   // Convert a list of integers into a comma-separated string
   public static void main(String[] args) {
       List<Integer> list= Arrays.asList(1,2,3,4,5,6);
       String strings=list.stream().map(String::valueOf).collect(Collectors.joining(","));
       System.out.println(strings);

   }



}
