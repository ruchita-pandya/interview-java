package com.example.corejava.java8;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<Integer> l1=Optional.empty();

        //Optional<Integer> l2=Optional.of(3);
        //Optional<Integer> l3=Optional.of(null);

        Optional<Integer> l4=Optional.ofNullable(null);

        //System.out.println(l4.orElseThrow(()->new RuntimeException("null value exception")));
    }

}
