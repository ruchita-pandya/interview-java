package com.example.corejava.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumerDemo= System.out::println;
        consumerDemo.accept(5);
        Supplier<Integer> supplier=()->  30 ;
        System.out.println( supplier.get());
        Predicate<Integer> predicate=i -> i % 2 == 0;
        System.out.println(predicate.test(2));
        System.out.println("=============");
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        list.stream().filter(predicate).forEach(consumerDemo);
        System.out.println("orsle"+list.stream().findFirst().orElseGet(supplier));



    }

}
