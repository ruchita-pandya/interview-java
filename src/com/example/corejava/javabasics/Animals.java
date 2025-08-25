package com.example.corejava.javabasics;

public abstract class Animals{
    private String name;

    Animals(String name){
        this.name=name;
    }
    public abstract void makesound();

    public String getName() {
        return name;
    }

}

class Dog extends Animals{

    String sound;

    public Dog(String name){
        super(name);

    }

    @Override
    public void makesound() {
        System.out.println(getName()+"barks");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Animals animals=new Dog("Abc");
        animals.makesound();

    }
}
