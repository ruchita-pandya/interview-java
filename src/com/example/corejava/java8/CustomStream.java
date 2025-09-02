package com.example.corejava.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomStream {
    public static void main(String[] args) {

        List<Manager> list=new ArrayList<>();
        list.add(new Manager(200000,30,"pranav"));
        list.add(new Manager(2600000,45,"amit"));
        list.add(new Manager(500000,23,"kapil"));
        list.add(new Manager(700000,37,"raju"));

        List<Manager> list1=list.stream().filter(a->a.getSalary()>400000).collect(Collectors.toList());
        System.out.println(list1);

    }
}
