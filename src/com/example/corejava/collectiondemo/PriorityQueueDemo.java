package com.example.corejava.collectiondemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        queue.offer(10);

        queue.offer(40);
        queue.offer(20);
        queue.offer(50);
        queue.offer(30);

        System.out.println(queue);
        System.out.println("after poll");
        queue.poll();
        System.out.println(queue);
    }
}
