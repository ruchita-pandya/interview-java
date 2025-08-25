package com.example.corejava.arraydemo;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a={2,1,6,4,5};
        int key=4;

        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                System.out.println(key+" found at index="+i);
            }
        }
    }
}
