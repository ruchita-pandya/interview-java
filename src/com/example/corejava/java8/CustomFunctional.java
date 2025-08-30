package com.example.corejava.java8;

@FunctionalInterface
public interface CustomFunctional {

    public int sum(int a,int b);

}

class LamdaDemo{

    public static void main(String[] args) {
        CustomFunctional customFunctional=
            (int a, int b) ->{ return a+b;};
        System.out.println(customFunctional.sum(2,3));
    }
}
