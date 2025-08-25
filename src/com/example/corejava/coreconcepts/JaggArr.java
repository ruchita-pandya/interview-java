package com.example.corejava.coreconcepts;

import java.util.Scanner;

public class JaggArr {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows in jagged array");
        int row=sc.nextInt();
        int[][] arr=new int[row][];
        int count=0;

        for (int i=0;i< arr.length;i++){
            arr[i]= new int[i+1];
        }

        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=count++;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
