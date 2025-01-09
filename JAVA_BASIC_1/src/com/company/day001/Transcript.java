package com.company.day001;

import java.util.Scanner;

public class Transcript {
	public static void main(String[] args) {
		double kor,eng,math;
		Scanner sc= new Scanner(System.in);
		System.out.println("국어점수 입력 > "); kor = sc.nextDouble();
		
		
		System.out.println("수학점수 입력 > "); math = sc.nextDouble();
		
		
		System.out.println("영어점수 입력 > "); eng = sc.nextDouble();
		
		
		
		double result = kor+math+eng;
		
		System.out.println("총점 :"+result);
		System.out.println("평균점수 :"+(result/3));		
		
	}

}
