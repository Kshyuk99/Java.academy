package com.company.day009;

interface Calc{ public double exec(double num1, double num2); }

public class NoNameClass002 {
	public static void main(String[] args) {
		System.out.println("1. 익명이너클래스");
		// Calc calc = new Calc()  X abstract는 구현부가 없다
		Calc calc = new Calc() { //테스트목적
			@Override
			public double exec(double num1, double num2) {				
				return num1 + num2;
			}			
		};
		System.out.println(calc.exec(10,3)); //13
	}
}
