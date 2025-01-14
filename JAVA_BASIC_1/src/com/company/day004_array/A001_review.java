package com.company.day004_array;
import java.util.Scanner;
public class A001_review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		/*if(i==1) {System.out.println("1이다");}
		else if(i==2) {	System.out.println("2이다");}
		else if(i==3) {System.out.println("3이다");}*/
		
		/*switch(i) {
		case 1: System.out.println("1이다"); break;
		case 2: System.out.println("2이다"); break;
		case 3: System.out.println("3이다"); break;
		}*/
		
		/*for(i=1; i<=3; i++) {
			System.out.println("Hello"+i);
		}*/
		
		for(;!(i==1);) {
			System.out.println("무한반복"); continue;
		}
		System.out.println("탈출");
	}

}
