package com.company.day003_reapeat;

import java.util.Scanner;

public class Transcript1 {
	public static void main(String[] args) {
		//변수		
		int kor=0,eng=0,math=-1, total=0;
		String k_lv="";
		String e_lv="";
		String m_lv="";
		String std =" ";
		String jang="X";		
		String star="";
		String pass ="불합격";
		float avg=0.0f;
		Scanner sc = new Scanner(System.in);
		//입력
		System.out.print("이름 입력");    std = sc.next();
		for(;;) { // 무한반복
			System.out.print("국어점수 입력"); kor = sc.nextInt();
			if(kor>=0 && kor<=100) {break;}	
		}
		for(;;) { // 무한반복
			System.out.print("영어점수 입력"); eng = sc.nextInt();
			if(eng>=0 && eng<=100) {break;}
		}
		for(; !(math>=0 && math<=100);) {		
			System.out.print("수학점수 입력"); math = sc.nextInt();				
		}
		//처리
		total = kor+eng+math;
		avg = total/3f;
		k_lv = kor+"[" +(kor>=90? "수" :kor>=80? "우" :kor>=70? "미":kor>=60? "양":"가") +"]";
		e_lv = eng+"[" +(eng>=90? "수" :eng>=80? "우" :eng>=70? "미":eng>=60? "양":"가") +"]";
		m_lv = math+"[" +(math>=90? "수" :math>=80? "우" :math>=70? "미":math>=60? "양":"가") +"]";
		
		if(avg>=70) {
			pass="합격";
			if(kor<40 || eng<40 || math<40) {pass="재시험";}
		}
		
		//평균이 100점대면 별이 10개, 93점이면 별이 9개
		//힌트1) (int)93.5/10 = 9 
		for(int i=0; i<(int)avg/10; i++) {star+="*";}
		
		System.out.println("====================================");
		System.out.println("이름\t국어\t수학\t영어\t총점\t레벨\t평균\t합격여부\t장학생");
		System.out.println("====================================");
		System.out.println(std+"\t"+k_lv+"\t"+m_lv+"\t"+e_lv+"\t"+total+"\t"+star+"\t"+String.format("%.2f", avg)+"\t"+pass+"\t"+jang);
		
		
		
		
		
		
		
		
		
	}
}



