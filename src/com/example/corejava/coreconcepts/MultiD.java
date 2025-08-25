package com.example.corejava.coreconcepts;

public class MultiD {

        public static void main(String[] args) {

            int[][][] threeD=new int[3][2][3];
            int it=1;

            for(int i=0;i<3;i++){
                for(int j=0;j<2;j++){
                    for(int k=0;k<3;k++){
                        threeD[i][j][k]=it;
                        it++;
                        System.out.print(threeD[i][j][k]+" ");
                    }
                    System.out.println();
                }
                System.out.println();
            }

        }
    }

