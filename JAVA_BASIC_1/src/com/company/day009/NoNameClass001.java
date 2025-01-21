package com.company.day009;

interface Inter1{ void method(); } // public abstract
class Inter1mpl implements Inter1{
	@Override
	public void method() {
		System.out.println(".....done");		
	}
}

public class NoNameClass001 {
	public static void main(String[] args) {
		System.out.println("1. 인터페이스 상속구현객체");
		Inter1mpl a1 = new Inter1mpl(); a1.method();
		
		System.out.println("2. 익명이너클래스");
		//Inter1 a2 = new Inter1(); // 불가능 void method();  {}없어서 구현내용 없음
		Inter1 a2 = new Inter1() {
			@Override
			public void method() {
				System.out.println(".......test");				
			} //테스트목적, 잘안쓰는 부분, 이벤트 몇번			
		}; a2.method();
	}
}
