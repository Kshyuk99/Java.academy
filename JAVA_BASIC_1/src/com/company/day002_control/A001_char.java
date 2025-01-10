package com.company.day002_control;

public class A001_char {
	public static void main(String[] args) {
		int a,b,x;
		char ch ='\u0000';   //'' 유니코드
		ch = 'A';  // 문자형 <->숫자 저장시 숫자저장, 문자로 출력
		System.out.println((int)ch);
		
		
		//2. int 보다 작은 정수형 : byte, short/char 연산시 int변경
		System.out.println('A' + 'B'); // 65+66 = 131
		System.out.println('0' + 'A'); // 48+65 = 113
		char d = '0' + 'A';
		System.out.println(d); //q
		
		//3. 많이 쓰느 표현 - 문자와 문자열은 다름
		// +는 1. 숫자와 숫자사이에 연산 / 2. 문자열 + 숫자 출력
		int z=10, y=3; char op='+';
		System.out.println("" +z + op + y + "=" + (z+y));
		//                 10   +   3    =     13
		
		
		a= 10; b=3; boolean c =true;
		System.out.println(a%2==0);
		System.out.println(a%3==0);
	}

}
