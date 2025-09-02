package com.example.corejava.singletoneg;

public class BillPugh {
    private static BillPugh billPugh;
    private static class Inner{
        private static final BillPugh billPugh=new BillPugh();

    }

    public static BillPugh getInstance(){
       return Inner.billPugh;
    }


}
