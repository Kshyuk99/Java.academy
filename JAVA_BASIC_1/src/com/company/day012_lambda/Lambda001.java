package com.company.day012_lambda;

//Lambda001
//1. 클래스는 부품객체 - 설계도
//2. 상태/행위			interface (public static final / public abstract)
//3. 코드간결
interface Inter1{ void method(); }
class 	  Inter1Impl implements Inter1{
	@Override public void method() {
		System.out.println("HELLO");		
	}
	
}//end class

public class Lambda001 {
	public static void main(String[] args) {
		//Inter1 a1 = new Inter1();
		//#1. interface 구현객체 만들기
		Inter1 a1 = new Inter1Impl(); a1.method();
		
		//#2. 익명이너클래스 (test목적, 잘안쓰는 이벤트)
		Inter1 a2 = new Inter1() {
			@Override public void method() { 
				System.out.println("Hello!");
			}
			
		};  a2.method();
		//#3. Lambda 뭐받아서 처리하는지 궁금  void method();
		Inter1 a3 = () -> {System.out.println("Hi"); };
		a3.method();
	}

}
