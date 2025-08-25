package com.example.corejava.coreconcepts;

import java.util.Arrays;

public class MultiDForeach {
    public static void main(String[] args) {
        int[][][] tDArray=new int[3][3][3];
        int it=1;

        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    tDArray[i][j][k]=it;
                    it++;
                }
               //System.out.println();
            }
            //System.out.println();
        }

        for(int outd[][]:tDArray){
            for (int intd[]: outd ){
                for (int ele:intd){
                    System.out.print(ele+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("===============");
        System.out.println(Arrays.deepToString(tDArray));
    }
}
