package com.company.day001;

public class A003_var {
	public static void main(String[] args) {
		// 1. 리터럴
		System.out.printf("정수 : %d, 실수 : %f, 문자열 : %s", 1,1.23,"abc");
		//2. 변수(open box) 1, 1.23,   "abc"
		// 정수 int, 실수 double, 문자열 String
		int d = 1; System.out.println("정수보관 :" +d);
		d=10;      System.out.println("정수보관 :" +d); 
		
		double dd = 1.23;  System.out.println("실수보관 :" +dd);
			   dd = 3.14; System.out.println("실수보관 :" +dd);
			   
	    String str = "abc"; System.out.println("문자열 :" +str);
	}

}
