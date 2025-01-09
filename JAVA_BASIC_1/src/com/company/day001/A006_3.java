package com.company.day001;

import java.util.Scanner;

public class A006_3 {
	public static void main(String[] args) {
		String name="";
		char ban = '\u0000';
		
		Scanner sc= new Scanner(System.in);
		System.out.println("당신의 이름을 입력하시오 > ");
		name= sc.next();					
		
		
		System.out.println("당신의 반을 입력하시오(A/B) > ");
		ban = sc.next().charAt(0);
		
		
		System.out.println(":::::::::::::::::::::");
		System.out.println("::USERINFO::");
		System.out.println(":::::::::::::::::::::");
			
		System.out.println(" ::NAME :" + name);		
		System.out.println(" ::CLASS :" + ban);	
		
	}

}
