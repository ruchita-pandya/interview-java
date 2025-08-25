package com.example.corejava.javabasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {

        String s="a";
        Pattern pattern=Pattern.compile("a*b");
        Matcher matcher=pattern.matcher("aaab");
        boolean b=matcher.matches();

        System.out.println("matching?-"+b);

        System.out.println("single line="+Pattern.matches("a+b","ab"));



    }

}
