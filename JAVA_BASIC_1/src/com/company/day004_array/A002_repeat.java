package com.company.day004_array;
// 사각형
import java.util.Scanner;
public class A002_repeat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
