package com.company.day006;

//1. 클래스는 부품객체
//2. 클래스는 속성과 행위

class A1{}
public class Class001 {
	public static void main(String[] args) {
		A1 a = new A1();  //3-1. new(heap 공간빌리기) A1() 초가화
			//3-3 a는   주소
		System.out.println(a);
		
	}

}
/* 3. A1 a = new A1();  
 --------------------------------
 [method : 정보, static, final] A1, Class001
 --------------------------------
[heap : 동적]    |[stack: 잠깐빌리기]
     A1{}       <- a
                | main
---------------------------------
*/