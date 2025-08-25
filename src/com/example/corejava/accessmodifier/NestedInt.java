package com.example.corejava.accessmodifier;

public class NestedInt {
    int a=20;
     void print(){
         System.out.println("print");
     }

     interface InnerInt{

         void show();
     }
}
class Present implements NestedInt.InnerInt{

    public static void main(String[] args) {
        NestedInt.InnerInt innerInt=new NestedInt.InnerInt() {
            @Override
            public void show() {
                System.out.println("inner int");
            }
        };
        innerInt.show();
    }


    @Override
    public void show() {

    }
}
