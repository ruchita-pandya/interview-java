package com.example.corejava.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalDemo1 {
    public static void main(String[] args) {
        Customer customer1 =new Customer("aman",23,null);
        Customer customer2 =new Customer("chaman",30,"pac");
        Customer customer3 =new Customer("golu",13,"derw");
        Customer customer4 =new Customer("bitu",20,"dsd");
        Customer customer5 =new Customer("chiku",29,"trrv");

        List<Customer> list=new ArrayList<>();
        list.add(customer1);
        list.add(customer2);
        list.add(customer3);
        list.add(customer4);
        list.add(customer5);

        String email=list.stream().
                filter(a->a.getName().startsWith("a"))
                .map(Customer::getEmail).filter(Objects::nonNull).findFirst().orElse("sdc");
        System.out.println(email);




    }
}
