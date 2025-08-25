package com.example.corejava.javabasics;

// Demonstrate working of finalize()
public class Geeks1 {
    public static void main(String[] args) {

        Geeks1 t = new Geeks1();
        System.out.println(t.hashCode());

        t = null;

        // calling garbage collector
        System.gc();

        System.out.println("end");
    }

    @Override protected void finalize()
    {
        System.out.println("finalize method called");
    }
}