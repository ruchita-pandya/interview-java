package com.example.corejava.arraydemo;

import java.util.Arrays;
import java.util.Random;

public class RandomNo {
    public static void main(String[] args) {
      int[] arr=getRandomNo(10);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] getRandomNo(int size){
        Random random=new Random();
        int[] arr=new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(100);
        }
       return arr;

    }
}
