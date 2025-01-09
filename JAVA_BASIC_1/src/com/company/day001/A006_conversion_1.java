package com.company.day001;
import java.util.Scanner;

public class A006_conversion_1 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("숫자1 입력");
		 float a = sc.nextInt();
		 
		 System.out.println("숫자2 입력");
		 float b = sc.nextInt();
		 
		 System.out.println((int)a+"/"+(int)b+"="+a/b );
	}

}
