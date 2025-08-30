package com.example.corejava.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class Student{
    private String name;
    private int age;

    public Student(int age, String name) {
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

    public static Comparator<Student> comparator=new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.age-o2.age;
        }
    };
}

public class ComparatorDemo {

    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(30,"akashya"));
        list.add(new Student(23,"Shubham"));
        list.add(new Student(34,"Rahul"));
        //list.sort(Student.comparator.reversed());
        //list.sort(Comparator.reversed());
        Collections.sort(list,Student.comparator);
        System.out.println(list);
           }


}
