package com.example.corejava.javabasics;

public class CBR {

    int data=50;

    void change(CBR cbr){
        cbr.data=cbr.data+20;
    }

    public static void main(String[] args) {
        CBR cbv=new CBR();
        System.out.println("before: "+cbv.data);
        cbv.change(cbv);
        System.out.println("after"+cbv.data);
    }

}
