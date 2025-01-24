package com.company.day012_lambda;

interface Inter4{int method(int a, int b); }
interface Inter41{int method(String str);  }
interface Inter42{void method(int num);}

public class Lambda004 {
	public static void main(String[] args) {
		System.out.println(Math.max(10, 3));
		//#1. Inter4 호출하면 Math.max(a,b) 최대값처리
		
		Inter4 a1 =(int a,int b)->{return Math.max(a, b);};		
		System.out.println(a1.method(10, 3));
		
		Inter4 a11 =(a,b)-> Math.max(a, b);	//간소화	
		System.out.println(a11.method(10, 3));
		
		//#2. ::참조식
		Inter4 a3 = Math::max;
		System.out.println(a3.method(10, 3));
		
		////////
		Inter41 ex1 = str -> str.length();
		System.out.println(ex1.method("ABC"));  //3.
		
		Inter41 ex11 = String::length;
		System.out.println(ex11.method("ABC"));
		
		//////////
		Inter42 ex2 = num ->System.out.println(num);
		ex2.method(100);
		
		Inter42 ex21 = System.out::println;
		ex21.method(100);
		
	}//end main
}//end class
