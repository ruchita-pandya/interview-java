package com.example.corejava.accessmodifier;

public interface OuterInterface {

    void print();
    interface InnerInterface{
        void show();
    }

}

class NestedInterface implements OuterInterface.InnerInterface,OuterInterface{

    @Override
    public void show() {
        System.out.println("inner interface method");
    }

    public static void main(String[] args) {
        NestedInterface nestedInterface=new NestedInterface();
        nestedInterface.show();
        nestedInterface.print();
    }

    @Override
    public void print() {
        System.out.println("outer");
    }
}