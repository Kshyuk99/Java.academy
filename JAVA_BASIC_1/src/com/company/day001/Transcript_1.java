package com.company.day001;

import java.util.Scanner;

public class Transcript_1 {
	public static void main(String[] args) {
		double kor,eng,math;
		Scanner sc= new Scanner(System.in);
		System.out.println("국어점수 입력"); kor = sc.nextDouble();
			
				
		System.out.println("영어점수 입력"); math = sc.nextDouble();
		
		
		System.out.println("수학점수 입력"); eng = sc.nextDouble();
		
		
		double result = kor+math+eng;
		System.out.println(":::::::::::::::::::::");
		System.out.println("::GREEN IT SCORE::");
		System.out.println(":::::::::::::::::::::");
		
		System.out.println("국어 "+(int)kor);
		System.out.println("영어 "+(int)eng);
		System.out.println("수학 "+(int)math);
		System.out.println("총점 "+(int)result);
		System.out.println("평균점수 "+(result/3));		
		
	}

}
