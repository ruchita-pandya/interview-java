package com.example.corejava.javabasics;
class  Parent{
    static int k=12;
    protected Parent(){
        this(10,20);
        k=40;
        System.out.println("superclass cons"+k);
    }

    Parent(int a,int b){
        System.out.println("paremeterized super"+a+"  "+b);
    }
}

public class ConsChaining extends Parent{

    public ConsChaining(){

        this("aman");
        System.out.println("base class default");
    }

    public ConsChaining(String a){
        super();
        System.out.println("base class parameter"+a);

    }

    public static void main(String[] args) {
        ConsChaining c=new ConsChaining();
    }
}
