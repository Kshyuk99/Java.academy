package com.company.day004_array;
// 역삼각형
import java.util.Scanner;
public class A002_repeat_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=a; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

