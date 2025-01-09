package com.company.day001;

import java.util.Scanner;

public class Transcript_3 {
	public static void main(String[] args) {
		int kor=0,eng=0,math=0, total=0;
		float avg =0.0f;
		String level ="";
		
		Scanner sc= new Scanner(System.in);
		System.out.println("국어점수 입력"); kor = sc.nextInt();
			
				
		System.out.println("영어점수 입력"); math = sc.nextInt();
		
		
		System.out.println("수학점수 입력"); eng = sc.nextInt();
		
		
	   
		System.out.println(":::::::::::::::::::::");
		System.out.println(":: GREEN IT SCORE ::");
		System.out.println(":::::::::::::::::::::");
		
		total = kor+math+eng;
		avg = total/3.3f;
		System.out.println("국어\t영어\t수학\t총점\t레벨\t평균");
		System.out.println(kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+"Lv"+(int)avg/10+"\t"+avg);	
		
	}

}
