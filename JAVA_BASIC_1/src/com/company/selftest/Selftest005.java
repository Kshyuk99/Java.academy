package com.company.selftest;
import java.util.Scanner;
public class Selftest005 {
	public static void main(String[] args) {		
	        Scanner sc = new Scanner(System.in);
	        System.out.print("당신의 나이를 입력하세요: ");
	        int age = sc.nextInt();
	        if (age < 19) {
	            System.out.println("당신은 미성년자입니다.");
	        } else {
	            System.out.println("당신은 성인입니다.");
	        }

	      
	}
}
