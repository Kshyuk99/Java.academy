package com.company.day002_control;
import java.util.Scanner;
public class A003_switch {
	public static void main(String[] args) {
		//System.out.println("현재 월을 입력하시오.> ");
		Scanner sc = new Scanner(System.in);
		//int month = sc.nextInt();
		
		/*switch(month) {
		case 3:
		case 4:
		case 5: System.out.println("봄"); break;
		
		case 6:
		case 7:
		case 8: System.out.println("여름"); break;
		
		case 9:
		case 10:
		case 11: System.out.println("가을"); break;
		
		case 12:
		case 1:
		case 2: System.out.println("겨울"); break;*/
		
		System.out.println("a,b,c 중에 문자 1개 입력> ");
		String fruit= sc.next();
		switch(fruit) {
		case "a": 
		case "A": System.out.println("APPLE"); break;
		
		case "b": 
		case "B": System.out.println("BANNA"); break;
		
		case "c": 
		case "C": System.out.println("COCONUT"); break;	
	
		
		}
		
	}

}
