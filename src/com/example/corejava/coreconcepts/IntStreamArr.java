package com.example.corejava.coreconcepts;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamArr {
    public static void main(String[] args) {
        int arr1[]= IntStream.range(1,5).toArray();
        int arr2[]= IntStream.rangeClosed(1,4).toArray();
        int arr3[]= IntStream.of(2,4,6,8,10).toArray();

        System.out.println("arr1[]"+ Arrays.toString(arr1));
        System.out.println("arr2[]"+Arrays.toString(arr2));
        System.out.println("arr3[]"+Arrays.toString(arr3));


    }
}
