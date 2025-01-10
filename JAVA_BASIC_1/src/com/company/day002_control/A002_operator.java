package com.company.day002_control;

public class A002_operator {
	public static void main(String[] args) {
		// 1. 먼저 () 2.값+,-,*,/  3.비교 == != > < 4.조건 && || 5.대입 =
		// 2. 산술연산자 (+,-,*,/,%)
		int a,b;
		a= 10; b=3; boolean c =true;
		
		System.out.println(a%2==0);
		System.out.println(a%3==0);
		//3. 조건  &&(모든조건)  ||(조건중에 하나라도)
		System.err.println(a>b && a%3==0); //a가 10보다 커야하고 3의배수
		System.err.println(a>b || a%3==0);
		
	}

}
