package com.example.corejava.singletoneg;

public class LazySingleton {

    private static LazySingleton lazy;

    private LazySingleton(){
        // this.lazy=lazy;
    }

    public static LazySingleton getInstance(){
        if(lazy==null){
            lazy=new LazySingleton();
        }
        return lazy;
    }

}
