package com.example.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumDigit {

    public static int sumOfEach(int n){

        int sum = 0;

        while (n>0) {
            int mod = n % 10;
            sum = sum + mod;
            n = n / 10;
        }
//        System.out.println(sum);

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(123,456,789);
        List<Integer> sumOfEach=list.stream().map(a->sumOfEach(a)).collect(Collectors.toList());
        System.out.println(sumOfEach);
    }


}
