package com.example.corejava.reflectionapi;

import java.lang.reflect.InvocationTargetException;

public class Test2 {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class c=Class.forName("com.example.corejava.reflectionapi.Simple");
        Object obj=c.newInstance();
        c.getDeclaredMethod("message",null).invoke(obj,null);

    }
}
