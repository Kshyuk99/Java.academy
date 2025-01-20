package com.company.day008;

// Q1. 상속도 그리기
// Q2. 각클래스에서 사용할수있는 멤버변수/멤버메서드

class Papa extends Object{  
	int money = 10000;     
	public Papa() { super(); }
	public void sing() {  System.out.println("GOD-거짓말");  }
}// end class

class Son2 extends Papa{ 
	int money = 1500;
	public Son2() { super(); }
	@Override public void sing() { super.sing(); System.out.println("빅뱅-거짓말"); }
} // end class
public class Polymorphism005 {
	public static void main(String[] args) {
		//Q8.    부모 = 자식   /  업캐스팅  /  타입캐스팅 X
		Papa mypapa = new Son2();    
		// Q3. Papa mypapa 의미?
		//  보장한다 - {money = 10000 /sing() GOD-거짓말}
		// Q4. 인스턴스화한 실제 메모리 빌려온그림  new (메모리, 객체생성) -> Son2() 초기화해서 사용가능 -> mypapa [1번지]
		// mypapa[1번지] = [1번지]{money = 1500 /sing() 빅뱅-거짓말}---{money = 10000 /---------}
		System.out.println(mypapa.money); // Q5.  출력  10000
		mypapa.sing();  //Q6. 출력  빅뱅-거짓말
		 //Q7. mypapa.money 를 이용해서  1500 출력되게 해주세요. 
		System.out.println(((Son2)mypapa).money);
	}
}
/*
	Object				 
	  ↑					   
	Papa {money = 10000 /sing() GOD-거짓말}    
	  ↑
	Son2 {money = 1500 /sing() 빅뱅-거짓말}  
*/