package com.company.day008;
/*
	Object				 
	  ↑					   
	 TestA2 (int a / toString)       
	  ↑
	 TestB2 (int a / toString)  
*/
class TestA2  extends Object{  // alt+shift+s (toString : 밑에서 4번째)
	int a=10;
	public TestA2() { super(); } //##
	@Override public String toString() { return "TestA2 [a=" + a + "]"; }
}
class TestB2  extends TestA2{
	int b=20;   //한줄 : ctrl + alt + j
	public TestB2() { super(); }  //##
	@Override public String toString() { return "TestB2 [b=" + b + "]"; }
}
public class Polymorphism002 {
	public static void main(String[] args) {
		TestA2  ta = new TestA2(); // 본인 = new 본인()
		//1-1. TestA2  ta 사용할수 있어야 하는 범위 TestA2(int a)
		//1-2. ta[1000번지] = [1000번지]TestA2{ a=10}
		System.out.println(ta);  // TestA2 [a=10]
		
		        ta = new  TestB2();// 부모 = 자식
		//2-1. ta 사용할수 있어야 하는 범위 TestA2(int a/toString)
		//2-2. ta[2000번지] = [2000번지] TestB2{b=20/toString }--TestA2{a=10/-----}
		//2-3. 부모 = 자식  / 업캐스팅 / 타입캐스팅 X
		System.out.println(ta);  // TestB2 [b=20]
		
		TestB2 tb = (TestB2) ta;
		//3-1. TestB2 tb  사용할수있는범위 TestB2{b=20/toString }--TestA2{a=10/-----}
		//3-2. 실제만들어진객체-인스턴스화 
		//     ta[2000번지] = [2000번지] TestB2{b=20/toString }--TestA2{a=10/-----}
		//3-3. 자식 = 부모  / 다운캐스팅 / 타입캐스팅 O
		System.out.println(tb);
	}
}// end class




