package com.example.corejava.javabasics;

public class StaticDemo {

    static int a=10;
    static {
        a=20;
        System.out.println("static block"+a);
    }
    void demoStatic(){
        System.out.println("static method");
    }

    public static void main(String[] args) {

    }

}
