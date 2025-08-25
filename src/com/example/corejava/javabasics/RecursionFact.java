package com.example.corejava.javabasics;

public class RecursionFact {
    static int result;
    static int fact(int n){
        if(n<=1)
            return 1;
        result= n*fact(n-1);
        return result;
    }

    public static void main(String[] args) {
        fact(5);
        System.out.println(fact(5));
    }
}
