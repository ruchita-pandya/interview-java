package com.example.corejava.collectiondemo;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class SummaryStats {
    public static void main(String[] args) {

        IntSummaryStatistics statistics= IntStream.of(10,20,30,40,20,50).summaryStatistics();
        System.out.println(statistics);
        long count=statistics.getCount();
        System.out.println(count);
    }
}
