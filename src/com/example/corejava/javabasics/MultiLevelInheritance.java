package com.example.corejava.javabasics;

class ParentD{
    ParentD(){
        System.out.println("ParentD cons");
    }
}

class SubD extends ParentD{
    SubD(){
        System.out.println("SubD cons");
    }
}

public class MultiLevelInheritance extends SubD{

    MultiLevelInheritance(){
        System.out.println("MultiLevelInheritance cons");
    }

    public static void main(String[] args) {
        MultiLevelInheritance levelInheritance=new MultiLevelInheritance();
    }
}
