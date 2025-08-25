package com.example.corejava.coreconcepts;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

class GFG{
    void print(){
        System.out.println("print");
    }
}

public class StrongRef {

    public static void main(String[] args) {
        GFG gfg=new GFG();
        ReferenceQueue<GFG> referenceQueue=new ReferenceQueue<>();
        PhantomReference<GFG> reference=new PhantomReference<>(gfg,referenceQueue);

            gfg=null;
            gfg=reference.get();
            gfg.print();
    }

}
