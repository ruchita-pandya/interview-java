package com.example.corejava.javabasics;

public  class FinalDemo {
   static final int speed_limit;

   static  {
        speed_limit=90;
    }

    FinalDemo(){
        //speed_limit=90;
    }
    final void run(){
        System.out.println("speed limit"+speed_limit);
    }
}
class Sub extends FinalDemo{

    public static void main(String[] args) {
        Sub sub =new Sub();
        sub.run();
    }

}
