package com.company.day004_array;
// 삼각형
import java.util.Scanner;
public class A002_repeat_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0; i<=a; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
