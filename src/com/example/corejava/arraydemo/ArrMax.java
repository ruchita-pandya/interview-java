package com.example.corejava.arraydemo;

public class ArrMax {
    public static void main(String[] args) {
        int[] arr={4,2,6,3};
        int max=Integer.MIN_VALUE;
        System.out.println(Integer.MIN_VALUE);
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max value is="+max);
    }
}
