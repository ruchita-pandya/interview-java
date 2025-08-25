package com.example.corejava.reflectionapi;
// Java program to demonstrate forName() method

public class Test4 {

    void printName(Object o){
        Class c= o.getClass();
        System.out.println("class name="+c.getName());
    }

    public static void main(String[] args)
            throws ClassNotFoundException
    {
        // get the Class instance using forName method
        Class c1 = Class.forName("com.example.corejava.reflectionapi.Simple");
        Simple s=new Simple();
         Test4 test4=new Test4();
          test4.printName(s);

       /* System.out.print("Class represented by c1: "
                + c1.getName());*/
    }
}
