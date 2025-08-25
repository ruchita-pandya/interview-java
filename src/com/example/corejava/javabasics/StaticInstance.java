package com.example.corejava.javabasics;
class Student{
    String name;
    int age;
    static String school="book";

    public void show(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("school:"+school);
    }
}
public class StaticInstance {

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.name="suraj";
        s1.age=10;
        //s1.school="sun";

        s2.name="moon";
        s1.age=20;
        //s1.school="kv";

        s1.show();
        s2.show();
    }
}
