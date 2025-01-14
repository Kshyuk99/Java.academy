package com.company.day004_array;
import java.util. Scanner;
public class A002_plus {
	public static void main(String[] args) {
		//수열의합
		//Scanner sc =new Scanner(System.in);
		/*System.out.println("ver-1");
		int a = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				
				sum+=j;
			}
		}
		System.out.println(sum);*/
		
		/*int m=0; // 윤년의 갯수
		for(int i=1; i<=2023; i++) {
			if(i%4==0 && i%100 !=0 || i%400==0) {
				m+=1;
			}
		}
		System.out.println("서기1년~서기2023년 중에서 윤년의 개수: "+m);*/
		
		/*int count=0; // 소문자 a~z까지 모음의 갯수
		for(char i='a'; i<='z'; i++ ) {
			if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u') {
				count+=1;
			}
		}
		System.out.println("소문자 a~z까지 모음의 갯수: "+count);*/
		
		int sum=0;		
		for(int i=1; i<=20; i++) {
			if(!(i%2==0 || i%3==0)) {sum+=i;}
			if(i%2!=0 && i%3!=0) {sum+=i;}
			
		}
		System.out.println(sum);
	}

}
