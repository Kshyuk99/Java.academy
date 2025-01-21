package com.company.day009;
import java.util.Scanner;
public class Exception001 {
	public static void main(String[] args) {
		int a= -1;
		Scanner sc = new Scanner(System.in);
		for(;;) {
			try {
			System.out.println("입력");
			a = sc.nextInt(); // a라는 친구는 int 받기기대  문자입력 + enter
			if(a==1) {break;}
		}catch(Exception e) {
			sc.next(); // 잘못된 입력처리 a
			System.out.println("숫자입력");
			}	
		}	
		System.out.println(a);	
	}
}
	

