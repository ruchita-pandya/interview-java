package com.example.corejava.collectiondemo;

import com.example.corejava.stringdemo.InstanceTest;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        //set.add(null);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(3);
        set.add(1);
set.remove(2);
        Set<Integer> set2=new TreeSet<>();
        System.out.println(set2.containsAll(set));

        Iterator<Integer> iterator= set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

