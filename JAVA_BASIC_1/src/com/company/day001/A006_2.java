package com.company.day001;

public class A006_2 {
	public  static void main(String[] args) {
		//Q1
		int in = 10;
		double dou = 1.2;
		
		double result1 = in + dou;     //int(4byte:정수)+ double(8byte: 실수)
		int result2 = in + (int)(dou); // [11].2 = 10+1.2
		
		System.out.println(result1);
		System.out.println(result2);
		
		byte a = 10;
		byte b = 20;
		
		int c1 = a + b;
		byte c2 = (byte)(a + b);
		
		System.out.println(c1);
		System.out.println(c2);
		
		// 문자변환
		char ch ='B';
		System.out.println("대문자 B는 숫자로 변환시 얼마> " + (int)ch );
		char ab = 'a';
		System.out.println("소문자 a 숫자로 변환시 얼마> " + (int)ab );
		char abc = ' ';
		System.out.println("소문자 ' '는 숫자로 변환시 얼마> " + (int)abc );
		char aa = 'A';  char aaa= 'a';
		System.out.println( "얼마> "+ (aa-aaa) );
		
		System.out.println("대문자 A를 소문자 a로 변환하기 " + (char)(aa+32));
		
		int x=10; int y=3; char z = '+';
		System.out.println("10 + 3 =13 게 출력하시오 ");
		System.out.println(""+x+z+y+"="+(x+y));
	}

}
