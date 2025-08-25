package com.example.corejava.arraydemo;

import java.util.Arrays;

public class BinarySrch {
    public static void main(String[] args) {
        int[] arr={2,4,22,14,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int k=14;
        System.out.println(k+"=element found at index="+ Arrays.binarySearch(arr,1,4,k));
    }

}
