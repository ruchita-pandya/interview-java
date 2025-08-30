package com.example.corejava.collectiondemo;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue=new ArrayDeque<>();

        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.addLast(5);
        queue.offer(6);
        queue.offerFirst(1);
        queue.pollLast();

        System.out.println(queue);
     /*   System.out.println("peek "+queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);*/

        Iterator<Integer> iterator=queue.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
