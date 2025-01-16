package com.company.day006;
import java.util.Scanner;
public class A001_review {
	public static void hi() {System.out.println("hi");}
	public static void hi(String a ) {System.out.println("hi " + a);}
	public static String hi1(String b) {return "Good Morning" + b;}
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//Q1
		
		//int i= sc.nextInt();
		/*
		if(i==10) {	System.out.println(10*10);}
		else if(i==20) {System.out.println(10*20);}
		else if(i==30) {System.out.println(10*30);} */
		
		//Q2
		/*
		switch(i) {
		case 10: System.out.println(10*10); break;
		case 20: System.out.println(10*20); break;
		case 30: System.out.println(10*30);break; 
		}*/
		//Q3
		/*
		for(int j=1; j<=3; j++) {
			System.out.print(" "+ j);
		} */
		/*
		int j=1;
		while(j<=3) {System.out.print(" "+ j); j++;} */
		/*
		int j=1;
		do {System.out.print(" " + j); j++;} while(j<=3); */
		
		//Q4
		/*
		int a=0;
		int []arr= {10,20,30};
		System.out.println(arr[2]);*/
		
		//Q5
		
		int [][]arr2 = new int[2][3];
		int data=1;
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = data++;
				System.out.print(arr2[i][j]);
			}
			System.out.println(); 
			
		}
		
		
		
		
		//Q6
		hi();
		
		
		
		
		//Q7
		hi("sally");
		
		
		
		//Q8
		System.out.println("Good Morning" + hi1("alpha"));
		
		
	}

}

