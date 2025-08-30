package com.example.corejava.coreconcepts;

class A{
    void m(){
        System.out.println("m");
    }
}

public class Tcast extends A{
    void m(){
        System.out.println("tcast");
    }
    public static void main(String[] args) {
        A a=new A();
        Tcast t=(Tcast) a;
        t.m();
    }
}
