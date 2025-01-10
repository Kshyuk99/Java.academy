package com.company.day002_control;

import java.util.Scanner;

public class Transcript_4 {
	public static void main(String[] args) {
		int kor,eng,math, total;
		char stdid='\u0000'; // 문자 하나
		String std="";
		float avg =0.0f;
		String pass,level,jang;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("학번 입력");    std = sc.next();
		System.out.println("국어점수 입력"); kor = sc.nextInt();		
				
		System.out.println("영어점수 입력"); math = sc.nextInt();		
		
		System.out.println("수학점수 입력"); eng = sc.nextInt();
		total = kor+math+eng;
		avg = total/3f;
		pass = avg>=60? "합격":"불합격";
		jang = avg>=95? "장학생":"-";
		level = (avg>=90? "수":avg>=80? "우":avg>=70? "미":avg>=60? "양":"가")
				+ "LV("+((int)avg/10)   +")";
		
		
	   
		System.out.println(":::::::::::::::::::::");
		System.out.println(":: GREEN IT SCORE ::");
		System.out.println(":::::::::::::::::::::");
		
		
		System.out.println("학번\t국어\t영어\t수학\t총점\t레벨\t평균\t합격여부\t장학생");
		System.out.println(std+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+"Lv"+(int)avg/10+"\t"+avg+"\t"+pass+"\t"+"\t"+jang);	
		
	}


}
