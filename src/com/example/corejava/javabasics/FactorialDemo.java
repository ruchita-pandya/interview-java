package com.example.corejava.javabasics;

public class FactorialDemo {


    int fact(int n){
        int result=1;
        for(int i=1;i<=n;i++){
           result=result*i;
        }
        return result;
    }

    public static void main(String[] args) {
         FactorialDemo demo=new FactorialDemo();
        System.out.println(demo.fact(5));
    }

}
