package com.example.corejava.coreconcepts;

import javax.script.ScriptContext;
import java.util.Scanner;

public class TDUser {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of arrays");
        int table=sc.nextInt();
        System.out.println("Enter no of rows");
        int row= sc.nextInt();
        System.out.println("Enter no of columns");
        int col= sc.nextInt();
        int[][][] tDArr=new int[table][row][col];

        System.out.println("enter array element");
        for (int i=0;i<table;i++){
            for (int j=0;j<row;j++){
                for (int k=0;k<col;k++){
                    tDArr[i][j][k]=sc.nextInt();
                }
            }
        }

        for (int out[][]:tDArr){
            for (int in[]:out){
                for (int ele:in){
                    System.out.print(ele+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
