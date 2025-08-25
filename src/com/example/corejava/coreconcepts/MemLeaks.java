package com.example.corejava.coreconcepts;

import java.util.ArrayList;
import java.util.List;

public class MemLeaks {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        while (true) {
            Object obj = new Object();
            // The list keeps growing and holds references to all objects
            list.add(obj);
            System.out.println("print");
        }
    }
}
