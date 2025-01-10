package com.company.day002_control;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,result=0;
		char op='\u0000';
		System.out.println("정수를 하나 입력해주세요.> ");
		a = sc.nextInt();
		
		System.out.println("정수를 하나 입력해주세요.> ");
		b = sc.nextInt();
		
		System.out.println("연산자를 입력해주세요.> ");
		op = sc.next().charAt(op);
		
		if(op=='+') {
			System.out.println(""+a+op+b+" = "+(a+b));
						
		}
		
		else if(op=='-') {
			System.out.println(""+a+op+b+" = "+(a-b));
		}
		else if(op=='*') {
			System.out.println(""+a+op+b+" = "+(a*b));
		}
		else if(op=='/') {
			System.out.println(""+a+op+b+" = "+(a/b));
		}
		else if(op=='%') {
			System.out.println(""+a+op+b+" = "+(a%b));
		}
		
		
	}

}
