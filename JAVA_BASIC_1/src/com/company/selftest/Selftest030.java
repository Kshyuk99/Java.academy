package com.company.selftest;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Test30  {
    private int no;
    private String name;
    private int price;

    
    public Test30 (int no, String name, int price) {
        this.no = no;
        this.name = name;
        this.price = price;
    }
    
    @Override public String toString() { return no + "\t" + name + "\t" + price; }  
       
    
}

public class Selftest030 {
    public static void main(String[] args) {
        
        Set<Test30 > f = new HashSet<>();
        f.add(new Test30 (1, "white", 1000));
        f.add(new Test30 (2, "choco", 1200));
        f.add(new Test30 (3, "banana", 1300));

        
        System.out.println("======================");
        System.out.println("NO\tNAME\tPRICE");
        System.out.println("======================");
        for (Test30  fruit : f) {
            System.out.println(fruit);
        }
    }
}