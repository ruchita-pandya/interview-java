package com.example.corejava.reflectionapi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Vehicle {

    private void message(){
        System.out.println("hello java");
    }

    private void cube(Integer n){
        System.out.println("cube: "+n*n*n);
    }
}

class PvtMethod{

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        /*Class c=Class.forName("com.example.corejava.reflectionapi.Vehicle");
        Vehicle obj =(Vehicle) c.newInstance();
        Method m=c.getDeclaredMethod("message",null);
        m.setAccessible(true);
        m.invoke(obj,null);*//*
        Class c1=Vehicle.class;
        Object obj1=c1.newInstance();
        Method m1=c1.getDeclaredMethod("cube"+new Class[]{Integer.class});
        m1.setAccessible(true);
        System.out.println("----------------------------");
        m1.invoke(obj1,5);*/

        Vehicle o =new Vehicle();
        Class c=o.getClass();

        Method m1=c.getDeclaredMethod("message",null);
        m1.setAccessible(true);
        m1.invoke(o,null);//Object,parameter

        Method m2=c.getDeclaredMethod("cube",Integer.class);
        m2.setAccessible(true);
        m2.invoke(o,5);//Object,parameter

    }

}
