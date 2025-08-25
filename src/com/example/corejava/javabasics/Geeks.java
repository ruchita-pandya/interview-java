package com.example.corejava.javabasics;

// Java Program to demonstrate Explicit downcasting
import java.io.*;
class Animal {
    int a=10;
    public void eat()
    {
        System.out.println("The animal is eating.");
    }
    public void taste(){
        System.out.println("bitter");
    }
}

class Cat extends Animal {
    int a=20;
    public void eat(){
        System.out.println("cat eating");
    }
    public void meow()
    {
        System.out.println("The cat is meowing.");
        int b=super.a;
    }

    public void work(){
        super.eat();
        meow();
        taste();
    }
}

public class Geeks {
    public static void main(String[] args)
    {
        Cat animal = new Cat();
        //animal.eat();
        animal.work();
        animal.taste();

        //animal.work();
        /*System.out.println(animal.a);
        // Explicit downcasting
        Cat cat = (Cat)animal;
        System.out.println(cat.a);
        cat.meow();
*/    }
}