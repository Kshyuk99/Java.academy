package com.company.day006;

public class A002_oop {
	public static void hi() {System.out.println("hi");}
	public static void hi(String b) {System.out.println("hi " +b);}
	public static String hi1(String a) {return a+"!";}
	
	public static void main(String[] args) {
		// 메서드기본구조
		// public static void hi(){System.out.println("hi " +a);}
		hi();
		
		hi("sally");
		hi1("alpha");
		
		
	}
	int add(int x, int y) {return x+y;}
	int add(byte a, byte b) {return a+b;}    //a   O
	int add(short a, short b) {return a+b;}  //b   O
	//long add(int a, int b) {return a+b;}     //c   X
	long add(long a, long b) {return a+b;}   //d   O
	
	
}



/*
 메서드 오버로딩
 1. 같은목적으로 비슷한동작을 수행하는 메소드들의 이름을 같게 만드는 작업.
 2. 같은이름(파라미터 타입, 갯수)
 
 */