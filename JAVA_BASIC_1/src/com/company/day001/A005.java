package com.company.day001;
import java.util.Scanner;
public class A005 {
	public static void main(String[] args) {
		float f = 0.0F;
		double d = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("실수 입력1");
		f= sc.nextFloat();
		System.out.println("실수 입력2");
		d= sc.nextDouble();
		
		System.out.println(f + "/" + d);
	}

}
