package com.example.corejava.stringdemo;

public class StringCompare {

    public static void main(String[] args) {
        String str1="Ram";
        String str2="Ram";
        String str3="Ravi";
        String str4=new String("Ram");
        String str5="rAM";

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str5));
        System.out.println(str1.equalsIgnoreCase(str5));
        System.out.println(str1.contains("am"));
    }
}
