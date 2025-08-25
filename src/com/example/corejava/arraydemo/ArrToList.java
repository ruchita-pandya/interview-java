package com.example.corejava.arraydemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrToList {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5};

        List<Integer> list= Arrays.asList(arr);
        ArrayList<Integer> arrayList=new ArrayList<>(list);
        System.out.println(arrayList);
        System.out.println("====using loop=====");
        ArrayList<Integer> arrayList1=new ArrayList<>();
        for (Integer ele:arr){
            arrayList1.add(ele);
        }
        System.out.println("using loop"+arrayList1);

        ArrayList<Integer> arrayList2=new ArrayList<>();
        Collections.addAll(arrayList2,arr);
        System.out.println("using collections"+arrayList2);
    }
}
