package com.example.corejava.java8;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
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
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class LamdaComparator {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Aman",23));
        list.add(new Person("Rahul",30));
        list.add(new Person("Pravin",20));
        list.add(new Person("Abhay",24));

        Collections.sort(list,(a, b)->a.getName().compareTo(b.getName()));
        System.out.println(list);
    }

}
