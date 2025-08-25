package com.example.corejava.javabasics;

public class StaticVar {
    static int a=m();

    static {
        System.out.println("static block"+a);
    }

    static int m(){
        System.out.println("method ");
        return 10;
    }

    public static void main(String[] args) {

    }
}
