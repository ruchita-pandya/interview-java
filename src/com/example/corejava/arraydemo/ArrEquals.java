package com.example.corejava.arraydemo;

import java.util.Arrays;

public class ArrEquals {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,6};
        int[] arr3={1,2,3,4,5};

        System.out.println("equality for arr1 and arr2="+ Arrays.equals(arr1,arr2));
        System.out.println("equality for arr1 and arr3="+ Arrays.equals(arr1,arr3));

        System.out.println("================index based===========");
        System.out.println("equality for arr1 and arr2="+ Arrays.equals(arr1,1,4,arr2,1,4));
        System.out.println("equality for arr1 and arr3="+ Arrays.equals(arr1,1,4,arr3,1,4));

        System.out.println("==========mismatch check===========");
        System.out.println("mismatch index for arr1 and arr2="+ Arrays.mismatch(arr1,arr2));
        System.out.println("mismatch index for arr1 and arr3="+ Arrays.mismatch(arr1,arr3));


    }
}
