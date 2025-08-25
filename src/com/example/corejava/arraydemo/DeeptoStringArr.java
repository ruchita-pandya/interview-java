package com.example.corejava.arraydemo;

import java.util.Arrays;

public class DeeptoStringArr {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4}};
        int[][] arr1= {{1,2},{3,4}};
        int[][][] arr2={{{1,2,3},{4,5,6}},{{8,9,10,11},{12,13}}};

        System.out.println("2d array"+ Arrays.deepToString(arr));
        System.out.println("3d array"+ Arrays.deepToString(arr2));
        System.out.println("==============equality check ============");
        System.out.println("is 2d array equal="+Arrays.deepEquals(arr,arr1));
    }



}
