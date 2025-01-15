package com.company.day005_method;
import java.util.Scanner;
public class A001_review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//char i = sc.next().charAt(0);
		//Q1
		/*
		if(i=='a') {
			System.out.println("apple");
		}
		else if(i=='b') {
			System.out.println("banana");
		}
		else if(i=='c') {
			System.out.println("coconut");
		}*/
		
		//Q2
		/*
		switch(i) {
		case'a': System.out.println("apple"); break;
		case 'b': System.out.println("banana"); break;
		case 'c': System.out.println("coconut"); break;
		} */
		
		//Q3
		/*
		for(int x=1; x<=3; x++) {
			System.out.print( " JAVA"+x);
		} */
		/*
		int x=1;
		while(x<=3) {System.out.println(" JAVA"+x); x++;}*/
		
		/*
		int x=1;
		do {System.out.print(" JAVA"+x); x++;} while(x<=3); */
		
		
		//Q4
		
					 
			
		for(int i=1; i<=4; i++) {
		for(int j=1; j<=4; j++) {
			System.out.print(j+ " ");				
		  }
			System.out.println();				
		}
				
	}
	
}
