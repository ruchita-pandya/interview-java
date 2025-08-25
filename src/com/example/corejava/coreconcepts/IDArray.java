package com.example.corejava.coreconcepts;

import java.util.Arrays;

public class IDArray {
    public static void main(String[] args) {
        int[] a=new int[5];
        a[0]=0;
        a[1]=1;
        a[2]=2;
        a[3]=3;

        for(int ele :a){
            System.out.println(ele);
        }
        System.out.println(Arrays.toString(a));
    }
}
