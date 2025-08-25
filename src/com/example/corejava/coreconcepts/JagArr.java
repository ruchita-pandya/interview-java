package com.example.corejava.coreconcepts;

import java.util.Scanner;

public class JagArr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter rows");
        int rows= sc.nextInt();
        int[][] arr=new int[rows][];
        int count=0;
        int temp=0;
        for (int i=0;i< arr.length;i++){
            arr[i]=new int[++count];
        }

        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=temp++;
            }
        }

        for (int[] out:arr){
            for (int inn:out){
                System.out.print(inn+" ");
            }
            System.out.println();
        }
    }
}
