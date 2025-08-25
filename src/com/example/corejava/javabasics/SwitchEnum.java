package com.example.corejava.javabasics;

public class SwitchEnum {
    public enum Day {monday,tuesday,wednesday,thursday,friday,saturday}

    public static void main(String[] args) {
        Day[] daysNow=Day.values();

        for (Day week:daysNow){
            switch (week){
                case monday:
                    System.out.println("monday");
                    break;
                case tuesday:
                    System.out.println("tuesday");
                    break;
                case wednesday:
                    System.out.println("wednesday");
                    break;
            }

        }
    }
    }

