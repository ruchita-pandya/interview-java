package com.example.corejava;

public class StrBuffer {
    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer("Hello");
        buffer.append("java");
        buffer.insert(9,"come!");
        buffer.delete(5,9);
        System.out.println(buffer);
    }
}
