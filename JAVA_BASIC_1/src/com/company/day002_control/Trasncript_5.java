package com.company.day002_control;
import java.util.Scanner;

public class Trasncript_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int kor,eng,math, total;
		
		String std =" ";
		String jang=" ";
		String grade;
		String pass ="불합격";
		System.out.println("학번 입력");    std = sc.next();
		System.out.println("국어점수 입력"); kor = sc.nextInt();
		System.out.println("영어점수 입력"); math = sc.nextInt();
		System.out.println("수학점수 입력"); eng = sc.nextInt();
		total = kor+math+eng;
		float avg = total/3f;
		
		if(avg>=70) {
			pass="합격";
			if(kor<40 || math<40 || eng<40) {pass="재시험";}		
		}				
		if(avg>=95) {
			jang="장학생";
		}
		
	     if(avg>=90) {grade="수";}
		else if(avg>=80) {grade="우";}
		else if(avg>=70) {grade="미";}
		else if(avg>=60) {grade="양";}
		else {grade="가";}
	     grade +="LV("+((int)avg/10)   +")";
		System.out.println("====================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t레벨\t평균\t합격여부\t장학생");
		System.out.println("====================================");
		System.out.println(std+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+grade+"\t"+avg+"\t"+pass+"\t"+jang);
	}
}
