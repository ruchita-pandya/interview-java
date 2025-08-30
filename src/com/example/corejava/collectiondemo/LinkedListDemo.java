package com.example.corejava.collectiondemo;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(50);
        list.add(20);
        list.add(10);
        list.add(40);
        list.add(30);
        list.add(20);
        //list.forEach(System.out::println);
        /*System.out.println("index 3="+list.get(3));
        System.out.println("frequency of 20="+Collections.frequency(list,20));*/
        //Collections.sort(list);
        //list.forEach(System.out::println);
        //System.out.println();
        //Collections.reverse(list);

       // list.forEach(System.out::print);
        //ListIterator<Integer> iterator=list.listIterator(list.size());

       /* while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
           // list.add(40);
        }
*/
        //remove duplicated
        List<Integer> list1=list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);
    }
}
