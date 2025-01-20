package com.company.day008;
// 1.클래스는 부품객체   2. 상태(멤버변수)/행위(멤버함수)
/*
	Object				 
	  ↑					   
	 TestA4 (int a=10 / toString)       
	  ↑
	 TestB4 (int b=20 / toString)  
*/
class TestA4 extends Object{
	int  a = 10;
	public TestA4() { super();  }
	@Override public String toString() { return "TestA4 [a=" + a + "]"; }
}
class TestB4 extends  TestA4{   
	int b=20;
	public TestB4() { super();  }
	@Override public String toString() { return "TestB4 [b=" + b + "]"; }
}
public class Polymorphism004 {
	public static void main(String[] args) {
		TestA4 ta = new TestA4();  //1. new   메모리빌리기, 객체생성 /2. 생성자(쓸수있게 초기화) /3. ta=번지 
		//1-1.   TestA4 ta;    TestA4 (int a=10 / toString)   보장할께!
		//1-2.   ta[1000번지] = new[1000번지] TestA4 (int a=10 / toString)
		
		TestB4 tb = new TestB4();
		//2-1.   TestB4 tb;  보장할께! TestB4 (int b=20 / toString)-TestA4 (int a=10 / toString)
		//2-2.   tb[2000번지] = new[2000번] TestB4 (int b=20 / toString)-TestA4 (int a=10 / --------)
		ta = new TestB4();
		tb = (TestB4) ta;   // 실행시 오류나는 이유는?   java.lang.ClassCastException:
		//3-1. tb    보장할께! TestB4 (int b=20 / toString)-TestA4 (int a=10 / toString)
		//3-2. ta의 인스턴스화(실제메모리) =           [1000번지] TestA4 (int a=10 / toString)
		//3-3. 아무리 타입캐스팅하더하도 사용불가 - TestB4() 생성자를 호출한적이 없어서 
		//		int b=20으로 사용가능하게 초기화한적이 없으므로 
		// 해결방안: 29번째줄에 ta=new TestB4()  자식생성자 호출한적이 있으면 ok!
		// tb(자식)=ta(부모)    / 다운캐스팅  /  타입캐스팅 /  부모는 자식생성자를 호출한적이 있어야 한다! 
	}
}// end class




