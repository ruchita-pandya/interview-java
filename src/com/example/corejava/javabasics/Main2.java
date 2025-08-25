package com.example.corejava.javabasics;

class Adder {
    // Method to add two integers and return an integer
    static int add(long a, int b) {
        return Math.toIntExact(a + b);
    }
    // Method to add two integers and return a double
    static double add(int a, int b) {
        return a + b;
    }
}
public class Main2 {
    public static void main(String[] args) {
        // This line of code will cause ambiguity because both add methods have the same signature
        System.out.println(Adder.add(11, 11)); // Error: ambiguity
    }
}