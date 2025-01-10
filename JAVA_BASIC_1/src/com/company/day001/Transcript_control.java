package com.company.day001;
import java.util.Scanner;
public class Transcript_control {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("1,2,3 중 좋아하는 숫자를 입력해주세요");
		int a =sc.nextInt();
		/*if(a>=60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}*/
		
		if(a==1) {
			System.out.println("one");
		}
		else if(a==2) {
			System.out.println("two");
		}
		else if(a==3) {
			System.out.println("three");
		}
		else {
			System.out.println("1,2,3이 아니다");
		}
		
	}

}
