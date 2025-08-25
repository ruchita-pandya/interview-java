package com.example.corejava.javabasics;

public class OuterClass {
    int outer_x=10;
    static int outer_y=20;
    private int outer_z=30;

       public  class InnerClass{
           void display(){
               OuterClass outerClass=new OuterClass();
               System.out.println("outer_x"+outerClass.outer_x);
               System.out.println("outer_y"+outer_y);
               System.out.println("outer_z"+outerClass.outer_z);
           }
       }
}
class NestedClassDemo{
    public static void main(String[] args) {
        OuterClass outerC =new OuterClass();
        OuterClass.InnerClass innerClass=outerC.new InnerClass();
        innerClass.display();
    }

}