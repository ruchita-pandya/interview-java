package com.example.corejava.javabasics;

public class Car {
    String name;
    int cost;

    public static void main(String[] args) {
        Car car=new Car();
        car.name="Bmw";
        car.cost=10;
        Car car1;
        car1=car;
        System.out.println("car.name "+car.name+" car.cost "+car.cost);
        System.out.println("car1.name "+car1.name+" car1.cost "+car1.cost);
        car1.name="audi";
        car1.cost=20;

        System.out.println("car.name "+car.name+" car.cost "+car.cost);
        System.out.println("car1.name "+car1.name+" car1.cost "+car1.cost);
    }

}
