package com.example.corejava.arraydemo;

import java.util.Arrays;

public class ArrReverse {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println("orignal array="+ Arrays.toString(a));
        getReversed(a);
        System.out.println("final array="+Arrays.toString(a));
    }

    private  static void getReversed(int[] a){
        int start=0;
        int end=a.length-1;

        while (start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}
