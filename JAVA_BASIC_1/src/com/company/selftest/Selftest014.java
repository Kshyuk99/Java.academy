package com.company.selftest;

public class Selftest014 {
	public static void main(String[] args) {
		for (int dan = 2; dan <= 4; dan++) {
            System.out.println(dan);
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " * " + i + " = " + (dan * i));
            }
            System.out.println(); 
        }
	}

}
