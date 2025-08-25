package com.example.corejava.arraydemo;

public class ArrMin {
    public static void main(String[] args) {
        int[] arr={4,2,6,3};
        int min=arr[0];

        for (int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("max value is="+min);
    }
}
