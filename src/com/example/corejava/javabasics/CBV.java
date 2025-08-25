package com.example.corejava.javabasics;

public class CBV {

    int data=50;

    void change(int data){
        data=data+20;
    }

    public static void main(String[] args) {
        CBV cbv=new CBV();
        System.out.println("before: "+cbv.data);
        cbv.change(500);
        System.out.println("after"+cbv.data);
    }

}
