package com.example.corejava.arraydemo;

import java.util.Arrays;

public class ArrFill {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Arrays.fill(arr,3);
        System.out.println(Arrays.toString(arr));
    }
}
