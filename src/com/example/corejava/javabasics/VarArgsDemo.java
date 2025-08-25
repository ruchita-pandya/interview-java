package com.example.corejava.javabasics;

import javax.swing.text.View;

public class VarArgsDemo implements Cloneable{

    void m(String s,int... b){
        System.out.println(s);
        System.out.println("length of int"+b.length);
        for(int j:b){
            System.out.print(j+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        VarArgsDemo varArgsDemo=new VarArgsDemo();
        VarArgsDemo varArgsDemo1= (VarArgsDemo) varArgsDemo.clone();

        varArgsDemo.m("hello",20,29);

        varArgsDemo.m("hi",1,2,3,4,5);
    }

}
