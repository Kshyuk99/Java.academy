package com.company.day005_method;

public class Method001 {
	//1. 함수정의    결과값   함수이름(재료)
	public static void   washer() { System.out.println("세탁을 합니다"); }
	public static void   line()  {System.out.println("\n------");}
	public static void   hi()    {System.out.println("hi");}
	///////////////////////////////////////////
	//0. JVM 가장우선실행 (전원)
	public static void main(String[] args) {
		//2. 함수사용 함수이름()을 부르면
		washer();
		line(); // 함수이름앞에 아무것도 없다 -> 결과값 void
		line();
		
		hi(); hi(); hi();
		
	}

}
