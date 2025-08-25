package com.example.corejava.arraydemo;

import java.util.Arrays;

public class ArrSort {
    public static void main(String[] args) {
        int[] arr={2,3,1,5,4,0};
        Arrays.sort(arr);
        //Arrays.sort(arr,0,3);
        System.out.println(Arrays.toString(arr));
    }
}
