package com.example.corejava.javabasics;

interface Demo{
     void show();
}


public class AnonymousDemo {

    static Demo  d=new Demo(){

        public void show(){

            System.out.println("subclass show");
        }
    };

    public static void main(String[] args) {
        d.show();
    }

}
