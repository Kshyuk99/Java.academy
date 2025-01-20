package com.company.day008;
// 1.클래스는 부품객체   2. 상태(멤버변수)/행위(멤버함수)
/*
	Object				 
	  ↑					   
	 TestA3 (int a=10 / toString)       
	  ↑
	 TestB3 (int b=20 / toString)  
*/
class TestA3 extends Object{
	int  a = 10;
	public TestA3() { super();  }
	@Override public String toString() { return "TestA3 [a=" + a + "]"; }
}
class TestB3 extends  TestA3{ 
	int b=20;
	public TestB3() { super();  }
	@Override public String toString() { return "TestB3 [b=" + b + "]"; }
}
public class Polymorphism003_ {
	public static void main(String[] args) {
		TestA3   ta = new TestA3();   //TestA3 = TestA3
		//1-1. TestA3   ta;    TestA3 (int a=10 / toString)  이거를 보장할께!
		//1-2.          ta[1000번지]  = new [1000번지] TestA3 (int a=10 / toString)
		
		TestB3   tb = new TestB3();  // TestB3 = TestB3
		//2-1. TestB3   tb;   TestB3 (int b=20 / toString) -- TestA3 (int a=10 / toString) 
		//2-2. tb[2000번지] = new [2000번지] TestB3{int b=20 / toString}-- TestA3 (int a=10 /----) 
		
		ta = tb;   //Q1. 부모=자식  /  업캐스팅  /  타입캐스팅필요 X
		//3-1. ta      TestA3 (int a=10 / toString)  이거를 보장할께!
		//3-2. ta[2000번지] = new [2000번지] TestB3{int b=20 / toString}-- TestA3 (int a=10 /----)
		System.out.println(ta);  // TestB3 [b=20]
		System.out.println(ta.a + "/" +((TestB3)ta).b);  // ta.b했을때 사용가능하게 만들기
	}
}// end class




