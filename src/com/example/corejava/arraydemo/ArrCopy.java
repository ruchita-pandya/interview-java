package com.example.corejava.arraydemo;

import java.util.Arrays;

public class ArrCopy {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
       // int[] arr2=arr1;  -shallow copy
        // int[] arr2= Arrays.copyOf(arr1,3);
        int[] arr2= Arrays.copyOf(arr1,arr1.length);
        System.out.println("first arr"+Arrays.toString(arr1));
        System.out.println("second arr"+Arrays.toString(arr2));
        arr1[0]=0;
        System.out.println("first arr"+Arrays.toString(arr1));
        System.out.println("second arr"+Arrays.toString(arr2));
    }
}
