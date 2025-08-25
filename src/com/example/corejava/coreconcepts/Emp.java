package com.example.corejava.coreconcepts;

public class Emp implements Cloneable{

    String city;

    public Emp(String city){
        this.city=city;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}

class Company implements Cloneable{


    String name;
    int rank;
    Emp emp;

    public Company(String name, int rank, Emp emp) {
        this.name = name;
        this.rank = rank;
        this.emp = emp;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Company c =(Company) super.clone();
         c.emp= (Emp) emp.clone();
        return c;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        try {
            Emp emp1 = new Emp("wardha");
            Company c=new Company("LNT",7,emp1);

            Company c1=(Company) c.clone();

            System.out.println("companyName "+c.name+" company rank "+c.rank+" Emp city="+c.emp.city);
            System.out.println("companyName "+c1.name+" company rank "+c1.rank+" Emp city="+c1.emp.city);

            c1.rank=8;
            c1.emp.city="pune";
            System.out.println("================modifying==========");
            System.out.println("companyName "+c.name+" company rank "+c.rank+" Emp city="+c.emp.city);
            System.out.println("companyName "+c1.name+" company rank "+c1.rank+" Emp city="+c1.emp.city);

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }


    }
}