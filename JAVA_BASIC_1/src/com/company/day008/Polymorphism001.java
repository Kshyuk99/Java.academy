package com.company.day008;

/*
	Object				Object
	  ↑					   ↑
	 TestA (int a)      TestB (int a)  
*/
class TestA  extends Object{
	int a=10;
}
class TestB  extends Object{
	int a=20;
}
public class Polymorphism001 {
	public static void main(String[] args) {
		TestA v110 = new TestA();
		//TestB v220 = v110;  
		// 오류나는 이유는?  자료형이 달라요!  TestA  !=  TestB
		// 클래스도 자료형(틀-Object)
		//Type mismatch: cannot convert from TestA to TestB
	}
}// end class
