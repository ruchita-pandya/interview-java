package com.example.corejava.javabasics;

public interface TestInterface {

    void voiceCat();
    void voiceDog();
}

 class SubInterface implements TestInterface{

    @Override
    public void voiceCat() {

    }

    @Override
    public void voiceDog() {

    }
}
