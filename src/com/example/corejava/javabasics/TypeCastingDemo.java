package com.example.corejava.javabasics;

class A {

    public void show() {
        System.out.println("Class parent");
    }

}

class B extends A{
    public void show(){

        System.out.println("base class");
        super.show();
    }

}


public class TypeCastingDemo {

    public static void main(String[] args) {
        try {
            A obj1=new B();
            B obj2= (B) obj1;
            obj1.show();
            //obj2.show();

        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

}
