package com.example.corejava.coreconcepts;

class Student{
    String name;
    int roll_no;

    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
}

public class StudArray {
    public static void main(String[] args) {
        Student[] students=new Student[3];
        students[0]=new Student("Aman",1);
        students[1]=new Student("Abhay",2);
        students[2]=new Student("Rohit",3);

        for(int i=0;i<students.length;i++){
            System.out.println("Student name-"+students[i].name+" "+"roll no-"+students[i].roll_no);
        }

    }
}
