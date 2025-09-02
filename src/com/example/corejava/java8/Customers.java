package com.example.corejava.java8;

import java.security.PrivateKey;
import java.util.List;
import java.util.function.Predicate;

public class Customers {
    private String name;
    private int age;
    private List<Integer> phoneno;

    public Customers(String name, int age, List<Integer> phoneno) {
        this.name = name;
        this.age = age;
        this.phoneno = phoneno;
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

    public List<Integer> getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(List<Integer> phoneno) {
        this.phoneno = phoneno;
    }
}
