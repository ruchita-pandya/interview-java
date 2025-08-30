package com.example.corejava.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 {
    private String name;
    private int age;

    public Student1(int age, String name) {
        this.age = age;
        this.name = name;
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


}


public class Java8Com {
    public static void main(String[] args) {
        List<Student1> list=new ArrayList<>();
        list.add(new Student1(30,"Akashy"));
        list.add(new Student1(23,"Shubham"));
        list.add(new Student1(34,"Rahul"));
        list.sort(Comparator.comparing(Student1::getName).thenComparing(Student1::getAge));
        System.out.println(list);
    }
}
