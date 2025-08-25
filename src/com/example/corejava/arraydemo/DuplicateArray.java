package com.example.corejava.arraydemo;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 2, 5, 6, 3};

        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                System.out.println("duplicate found"+arr[i]);
            }
        }
    }

}
