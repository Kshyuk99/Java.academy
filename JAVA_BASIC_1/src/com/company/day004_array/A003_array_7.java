package com.company.day004_array;

public class A003_array_7 {
	public static void main(String[] args) {
		// A B C D E
		char [] ch =new char[5];  //1. new 공간빌려오기
								  //2. char 문자
								  //3. [5] 5개 0~4
		char data ='A';
		/*
		ch[0] = data++;  //1. ch[0]  'A' 대입   2. A증가 B
		ch[1] = data++;  //1. ch[1]  'A' 대입   2. B증가 C
		ch[2] = data++; 
		ch[3] = data++;  
		ch[4] = data++;  */
		for(int i=0; i<ch.length; i++) {ch[i] = data++;}
		
		/*
		System.out.print( ch[0] + "\t");
		System.out.print( ch[1] + "\t");
		System.out.print( ch[2] + "\t");
		System.out.print( ch[3] + "\t");
		System.out.print( ch[4] + "\t"); */     // {} {변수}  for(시작;종료;변화)
		
		for(int i=0; i<ch.length; i++) {System.out.print( ch[i] + "\t");}
	}

}
