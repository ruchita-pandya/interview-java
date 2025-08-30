package com.example.corejava.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(0,0);
        //list.set(6,7);
        System.out.println(list);
        ArrayList<Integer> list1=new ArrayList<>(list);
        list1.add(6);
        //list1.set(6,7);
        System.out.println(list1);
        ListIterator<Integer> iterator= list1.listIterator(list1.size());
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
