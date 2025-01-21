package com.company.day009;

public class Exception002 {
	public static void main(String[] args) {
		//System.out.println(10/0);
		//1) 에러복사 / 그 줄수에가서 try{에러날만한 내용}catch(에러내용){에러시 처리}
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {System.out.println("문의하세요");}
		//2) 
		try {
			System.out.println(10/0);
		}catch(Exception e) {System.out.println("문의하세요");}
		// 부모는 자식을 담을수 있다
	}

}
/*                                     ↓ 1) 복사 ArithmeticException
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.company.
	day009.Exception002.main(Exception002.java:5) #2) 줄수
 
    
 
 */