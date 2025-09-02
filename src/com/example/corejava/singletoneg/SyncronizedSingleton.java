package com.example.corejava.singletoneg;

public class SyncronizedSingleton {

    private static SyncronizedSingleton syncronizedSingleton;

    private SyncronizedSingleton(){}

    public static synchronized SyncronizedSingleton getInstance(){
        if(syncronizedSingleton==null){
            syncronizedSingleton=new SyncronizedSingleton();
        }
        return syncronizedSingleton;
    }

}
