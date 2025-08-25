package com.example.corejava.javabasics;

class Desk{
    int a=10;
}

public class Runtimepoly extends Desk {
    int a=20;
    public static void main(String[] args) {
        Desk runtimepoly =new Runtimepoly();
        System.out.println(runtimepoly.a);
    }
}
