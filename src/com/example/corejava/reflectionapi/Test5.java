package com.example.corejava.reflectionapi;

public class Test5 {
    public static void main(String args[]) throws Exception {
        Class c=Class.forName("com.example.corejava.reflectionapi.Simple");
        Simple s=(Simple) c.newInstance();
        s.message();
    }
}
