package com.example.corejava.controlstatements;

public class InfiniteForLoop {
    // Java program to demonstrate
// the infinite for loop

        public static void main(String[] args)
        {
            for (int i = 0; i < 5; i++) {
                if (i == 2) {

                    // Modifies the loop variable and skips
                    // the next iteration
                    i++;
                }
                System.out.println(i);
            }
        }

}
