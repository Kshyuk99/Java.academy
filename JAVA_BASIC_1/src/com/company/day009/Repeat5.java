package com.company.day009;

//Q1. 상속도 그리기
//Q2. 각클래스에서 사용할수있는 멤버변수/멤버메서드
class Papa extends Object{  
	int money = 10000;     
	public Papa() { super(); }
	public void sing() {  System.out.println("GOD-거짓말");  }
}// end class

class Son2 extends Papa{ 
	int money = 1500;
	public Son2() { super(); }
	@Override public void sing() {  System.out.println("빅뱅-거짓말"); }
} // end class
public class Repeat5 {
	public static void main(String[] args) {
		// Q8.  부모 =  자식    /  업캐스팅 /  타입캐스팅 필요X
		// 		부모는 자식을 담을 수 있다
		Papa mypapa = new Son2();    
		// Q3. Papa mypapa 의미?       Papa  {money = 10000 /sing()} 보장
		// Q4. 인스턴스화한 실제 메모리 빌려온그림   
		// mypapa[1000] = new {money = 1500 /sing() 빅뱅-거짓말}- Papa {money = 10000 /---------}
		System.out.println(mypapa.money); // Q5.  출력  10000  
		mypapa.sing();  //Q6. 출력   빅뱅-거짓말
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