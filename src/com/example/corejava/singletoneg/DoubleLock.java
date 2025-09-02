package com.example.corejava.singletoneg;

public class DoubleLock {

    private static volatile DoubleLock lock;

    private DoubleLock(){}

    public static DoubleLock getInstance(){
        if(lock==null){
            synchronized (DoubleLock.class){
                if(lock==null)
                lock=new DoubleLock();
            }
        }
        return lock;
    }

}
