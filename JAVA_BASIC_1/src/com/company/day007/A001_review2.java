package com.company.day007;
import java.util.Scanner;


public class A001_review2 {
	public static void hello() {System.out.println("hello");}
	public static void hello(String a) {System.out.println("hi " + a);}
	public static String hello1(String b) {return "Hello"+ b;}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		//Q1
		if(i==1) {System.out.println("1을 입력받으면" + i+"이다");}
		else if(i==2) {System.out.println("2을 입력받으면" + i+"이다");}
		else if(i==3) {System.out.println("3을 입력받으면" + i+"이다");}
		//Q2
		switch(i) {
		case 1: System.out.println("1을 입력받으면" + i+"이다"); break;
		case 2: System.out.println("2을 입력받으면" + i+"이다"); break;
		case 3: System.out.println("3을 입력받으면" + i+"이다"); break;
		}
		//Q3
		/*for(int x=1; x<=3; x++) {System.out.print(" "+x*100);}
		
		int x=1;
		while(x<=3) {System.out.print(" "+x*100); x++;}
		
		 x=1;
		do{System.out.print(" "+x*100); x++;}while(x<=3); */
		
		//Q4
		/*int arr[]= {100,200,300};
		for(int y=0; y<arr.length; y++) {System.out.print(" "+arr[y]);}
		*/
		//Q5
		/*
		int [][]arr2 = new int[2][3];
		int data=1;
		for(int j=0; j<arr2.length; j++) {
			for(int k=0; k<arr2[j].length; k++) {
				arr2[j][k]=data++;
				System.out.print(" "+arr2[j][k]*100);
			}
			System.out.println();
		}*/
		//Q6, 7, 8
		hello();
		hello("sally");
		System.out.println( hello1(" Hello"));
		
		//Q9
		//오버로딩
	}

}
