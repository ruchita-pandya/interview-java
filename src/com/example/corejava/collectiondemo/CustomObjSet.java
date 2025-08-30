package com.example.corejava.collectiondemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

class Company{
    private String name;
    private int yrStart;

    public Company(String name, int yrStart) {
        this.name = name;
        this.yrStart = yrStart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYrStart() {
        return yrStart;
    }

    public void setYrStart(int yrStart) {
        this.yrStart = yrStart;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", yrStart=" + yrStart +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return yrStart == company.yrStart && Objects.equals(name, company.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yrStart);
    }
}

public class CustomObjSet {
    public static void main(String[] args) {
        Set<Company> companySet=new LinkedHashSet<>();
        companySet.add(new Company("abc",2000));
        companySet.add(new Company("abc",2000));
        companySet.add(new Company("abc",2000));

        companySet.add(new Company("xyz",1995));
        companySet.add(new Company("def",1998));
        companySet.add(new Company("hij",2024));

        System.out.println(companySet);

    }
}
