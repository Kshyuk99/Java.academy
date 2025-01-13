package com.company.day002_control;
import java.util.Scanner;

public class A004_review {
	public static void main(String[] args) {
		/*System.out.println("a,b,c 중에 한개의 문자를 입력하시오> ");
		Scanner sc = new Scanner(System.in);
		String i =sc.next().charAt(0);
		if(i=='a' || i=='A') {
			System.out.println("apple");
		}
		else if(i=='b' || i=='B') {
			System.out.println("banana");
		}
		else if(i=='c' || i=='C') {
			System.out.println("coconut");
		}
		System.out.println(i); */
		
		Scanner sc = new Scanner(System.in);
		/*System.out.println("a,b,c 중에 문자 1개 입력> ");
		String fruit= sc.next();
		switch(fruit) {
		case "a": 
		case "A": System.out.println("APPLE"); break;
		
		case "b": 
		case "B": System.out.println("BANNA"); break;
		
		case "c": 
		case "C": System.out.println("COCONUT"); break;	
	
		
		
	} */
		
		for(int i=1; i<=3; i++) {
			System.out.println("Hi"+i);
		}
	}


}
