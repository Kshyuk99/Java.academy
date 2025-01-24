package com.company.day012_lambda;


interface Inter21{void hi();}
interface Inter22{void hi(int a);}
interface Inter23{int hi();}
interface Inter24{int hi(int a);}

public class Lambda002 {
	public static void main(String[] args) {
		//	#1. Inter21 - 한줄짜리면 {} 생략가능 void hi();
		Inter21 a1 = ()->{System.out.println("Hi");};
		Inter21 a11 = ()->System.out.println("Hi"); 
		a1.hi();   a11.hi(); System.out.println("\n");
		
		// #2. Inter22 -  void hi(int a); a의 갯수만큼 "안녕"출력
		Inter22 a2 = (int a)->{System.out.println("hi");};
		Inter22 a22 = (int a)->{
			String result="";
			for(int i=0; i<a; i++) {result +="hi";}
			System.out.println(result);
		}; a22.hi(2);
		a2.hi(0);
		
		Inter22 a21 = a ->System.out.println("HI".repeat(a));
		a21.hi(3);
		
		//#3. Inter23 - int hi();
		Inter23 a3 = ()->{return 3;};
		Inter23 a31 = ()->3;
		System.out.println(a3.hi()); //3
		System.out.println(a31.hi()); //3
		
		// #4. Inter24 - int hi(int a); 
		Inter24 a4 = (int a)->{return a*10;};
		Inter24 a41 = a-> a*10;
		System.out.println(a4.hi(3));  //30
		System.out.println(a41.hi(3));  //30

		
	}//end main

}//end class
