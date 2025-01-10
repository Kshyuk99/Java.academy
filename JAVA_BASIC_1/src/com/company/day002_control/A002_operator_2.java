package com.company.day002_control;

public class A002_operator_2 {
	public static void main(String[] args) {
		/*int x=0; char ch='\u0000';
		x=5;   System.out.println("1: " + (x>3 && x<10));
		ch='A'; System.out.println("2: " + (ch=='a' || ch=='A'));
		ch='3'; System.out.println("3: " + (ch=='0' && ch<='9'));
		ch='C'; System.out.println("4: " + (ch>='A' && ch<='Z' || ch>='a' && ch<=
				'z'));*/
		
		int a=1, b=1, c=1, d=1;
		
		System.out.println(++a);          //2 증가하고 출력
		System.out.println("처리1: " + a); // 2
		System.out.println(b++);          // 1 츨력하고 증가
		System.out.println("처리2: " + b); // 2
		
		System.out.println(--c);         // 0 빼고 출력
		System.out.println("처리1: " + c);// 0
		System.out.println(d--);         // 1 출력빼기
		System.out.println("처리2: " + d);// 0
		
		int test1 =3, testb=10;
		System.out.println(testb +=10 - test1++);  // 17
		System.out.println(test1); //4
		//1. 10-test1  10-3=7
		//2. testb +=7  10+7=17
		//3. test1++
		System.out.println(test1 +=5);             // 9
		//4. 4+=5
		
		// 삼항연산자         조건?      참:거짓
		int t=1;
		System.out.println(t>0 ? "양수":"음수");
	}
	
	

}
