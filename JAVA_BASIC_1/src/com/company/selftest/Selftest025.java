package com.company.selftest;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Milk {
    private String name;
    private int price;

    public Milk() { }

    public Milk(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override public String toString() {
        return "Milk [name=" + name + ", price=" + price + "]";
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    @Override public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Milk a = (Milk) obj;
        return Objects.equals(name, a.name) && price == a.price;
    }
}

public class Selftest025 {
    public static void main(String[] args) {
        Set<Milk> set = new HashSet<>();        
        Milk m1 = new Milk("choco", 1200);
        Milk m2 = new Milk("white", 1300);
        Milk m3 = new Milk("banana", 1500);

        set.add(m1);
        set.add(m2);
        set.add(m3);

  
        for (Milk milk : set) {
            System.out.println(milk.getName() + " / " + milk.getPrice());
        }
    }
}