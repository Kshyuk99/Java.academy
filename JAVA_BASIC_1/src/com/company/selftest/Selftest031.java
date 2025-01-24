package com.company.selftest;

import java.util.HashMap;
import java.util.Map;

class Test31  {
    private int no;
    private String name;
    private int price;

    
    public Test31 (int no, String name, int price) {
        this.no = no;
        this.name = name;
        this.price = price;
    }    
    
    @Override public String toString() { return no + "\t" + name + "\t" + price; }
}

public class Selftest031 {
    public static void main(String[] args) {
        
        Map<Integer, Test31 > fruit = new HashMap<>();
        fruit.put(1, new Test31 (1, "white", 1000));
        fruit.put(2, new Test31 (2, "choco", 1200));
        fruit.put(3, new Test31 (3, "banana", 1300));

        
        System.out.println("======================");
        System.out.println("NO\tNAME\tPRICE");
        System.out.println("======================");
        for (Test31  product :  fruit.values()) {
            System.out.println(product);
        }
    }
}