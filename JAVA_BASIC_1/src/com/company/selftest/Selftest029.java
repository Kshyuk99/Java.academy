package com.company.selftest;

import java.util.ArrayList;
import java.util.List;

class Fruit  {
    private int no;
    private String name;
    private int price;

    
    public Fruit (int no, String name, int price) {
        this.no = no;
        this.name = name;
        this.price = price;
    }    
    @Override public String toString() { return no + "\t" + name + "\t" + price; }
}

public class Selftest029 {
    public static void main(String[] args) {
        
        List<Fruit > f = new ArrayList<>();
        f.add(new Fruit (1, "white", 1000));
        f.add(new Fruit (2, "choco", 1200));
        f.add(new Fruit (3, "banana", 1300));

       
        System.out.println("======================");
        System.out.println("NO\tNAME\tPRICE");
        System.out.println("======================");
        for (Fruit  fruit : f) {
            System.out.println(fruit);
        }
             
    }
}