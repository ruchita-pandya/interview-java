package com.example.corejava.coreconcepts;

public class SeasonName {
    enum Seasons{Jan(1),Feb(2),Mar(3),Apr(4),May(5),Jun(6),Jul(7),Aug(8),Sep(9),Oct(10),Nov(11),Dec(12)
        ;
    private final int value;
        Seasons( int value) {
            this.value = value;
        }
        int getValue(){
            return value;
        }
    }



    public static void main(String[] args) {
        Seasons name=Seasons.Nov;


        switch (name){
            case Jan:
                System.out.println("winter"+Seasons.valueOf("Jan"));
                break;
            case Feb:
                System.out.println("winter");
                break;
            case Mar:
                System.out.println("summer");
                break;
            case Apr:
                System.out.println("summer");
                break;
            case May:
                System.out.println("summer");
                break;
            case Jun:
                System.out.println("summer");
                break;
            case Jul:
                System.out.println("rainy");
                break;
            case Aug:
                System.out.println("rainy");
                break;
            case Sep:
                System.out.println("rainy");
                break;
            case Oct:
                System.out.println("rainy");
                break;
            case Nov:
                System.out.println("winter"+Seasons.valueOf("Jan"));
                break;
            case Dec:
                System.out.println("winter");
                break;


        }
    }
}
