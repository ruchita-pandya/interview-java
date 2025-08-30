package com.example.corejava.stringdemo;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StrConversion {
    public static void main(String[] args) {

        String s="a";
        byte[] b=s.getBytes();
        System.out.println(Arrays.toString(b));
    }
}
