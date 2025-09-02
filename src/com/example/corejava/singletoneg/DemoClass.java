package com.example.corejava.singletoneg;

public class DemoClass {
    public static void main(String[] args) {
        EagerSingleton es1=EagerSingleton.getEagerSingleton();
        EagerSingleton es2=EagerSingleton.getEagerSingleton();

        if (es1==es2){
            System.out.println("es1="+es1.hashCode());
            System.out.println("es2="+es2.hashCode());
        }
        System.out.println("==============================");
        LazySingleton ls1=LazySingleton.getInstance();
        LazySingleton ls2=LazySingleton.getInstance();

        if (ls1==ls2){
            System.out.println("ls1="+ls1.hashCode());
            System.out.println("ls2="+ls2.hashCode());
        }

        System.out.println("========================");
        SyncronizedSingleton ss1=SyncronizedSingleton.getInstance();
        SyncronizedSingleton ss2=SyncronizedSingleton.getInstance();
        if(ss1==ss2) {
            System.out.println("ss1=" + ss1.hashCode());
            System.out.println("ss2=" + ss2.hashCode());
        }

        System.out.println("=======Double Lock=======");
        DoubleLock lock1=DoubleLock.getInstance();
        DoubleLock lock2=DoubleLock.getInstance();
        if (lock1==lock2){
            System.out.println("lock1=" + lock1.hashCode());
            System.out.println("lock2=" + lock2.hashCode());
        }
        System.out.println("=================");
        BillPugh bill1=BillPugh.getInstance();
        BillPugh bill2=BillPugh.getInstance();

        if (bill1==bill2){
            System.out.println("bill1=" + bill1.hashCode());
            System.out.println("bill2=" + bill2.hashCode());
        }
    }


}
