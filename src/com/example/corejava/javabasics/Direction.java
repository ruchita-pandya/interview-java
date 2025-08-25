package com.example.corejava.javabasics;

import com.example.corejava.reflectionapi.Simple;

public enum Direction {
    EAST("hey east"),WEST("hey west"),NORTH("hey north"),SOUTH("hey south");


    private  String description;
    //Creating a Constructor
    Direction(String description) {
        this.description = description;
    }
    // Method to return custom description
    @Override
    public String toString() {
        return this.description;
    }
}

 class DirectionDemo{

    Direction d;
    DirectionDemo(Direction d){

        this.d=d;
    }

    void getDirection(){
    switch (d) {
        case EAST:
            System.out.println("this is east"+d.ordinal());
            break;
        case WEST:
            System.out.println("this is west"+d.name());
            break;
        case NORTH:
            System.out.println("this is north"+d.toString());
            break;
        case SOUTH:
            System.out.println(d+"this is south"+d.name());
            break;
        default:
            System.out.println("default");
    }

    }

     public static void main(String[] args) {
    DirectionDemo demo=new DirectionDemo(Direction.SOUTH);
    demo.getDirection();
         for(Direction d : Direction.values()) {
             System.out.println(d + " (" + d.name() + ")");
         }
     }
}

