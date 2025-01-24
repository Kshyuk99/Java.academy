package com.company.selftest;
import java.util.Scanner;
public class Selftest013 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);        
		System.out.print("원하는 단을 입력하세요 : ");
        int dan = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + (dan * i));	      
	}
 }
}
