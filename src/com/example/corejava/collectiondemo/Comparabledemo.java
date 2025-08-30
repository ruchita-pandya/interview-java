package com.example.corejava.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
    private String name;
    private  int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Comparabledemo {

    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee("ajay",23));
        list.add(new Employee("rohan",31));
        list.add(new Employee("mohit",20));

        Collections.sort(list);
        System.out.println(list);

    }

}
