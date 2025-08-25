package com.example.corejava.javabasics;

class Address implements Cloneable{
    String city;
    Address(String city){
        this.city=city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}

class Student1 implements Cloneable{
    int rollno;
    String name;
    Address address;


    public Student1(String name, int rollno, Address address) {
        this.name = name;
        this.rollno = rollno;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student1 student1=(Student1) super.clone();
        student1.address=(Address)address.clone();
         return student1;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", address=" + address.toString() +
                '}';
    }
}

public class ObjectCloning {
    public static void main(String[] args) {
        try {
            Address address=new Address("bhopal");
            Student1 s1=new Student1("ravi",10,address);
            Student1 s2=(Student1) s1.clone();
            System.out.println(s1.toString());
            System.out.println(s2.toString());
            System.out.println("modifying");
            s1.rollno=20;
            s1.address.city="Noida";
            System.out.println(s1.toString());
            System.out.println(s2.toString());
        }catch (CloneNotSupportedException e){}
    }
}
