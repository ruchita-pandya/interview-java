package com.example.corejava.java8;
interface PT1{
    default void show(){
        System.out.println("default in pt1");
    }
}
interface PT2{
    default void show(){
        System.out.println("default in pt2");
    }
}
public class DefaultMethodsDemo implements PT1,PT2 {



    public void showofPT1() {
        PT1.super.show();
    }


    public void showofPT2() {
        PT2.super.show();
    }

    @Override
    public void show() {
        PT1.super.show();
        PT2.super.show();
    }

    public static void main(String[] args) {
        DefaultMethodsDemo demo=new DefaultMethodsDemo();
        demo.show();
    }
}
