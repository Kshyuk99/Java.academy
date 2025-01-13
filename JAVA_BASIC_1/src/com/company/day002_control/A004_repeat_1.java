package com.company.day002_control;
import java.util.Scanner;
public class A004_repeat_1 {
	public static void main(String[] args) {
		System.out.println("원하는 단을 입력해주세요 > ");
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
	   /*System.out.println(a + "*" + 1 +"="+(a*1));
		System.out.println(a + "*" + 2 +"="+(a*2));
		System.out.println(a + "*" + 3 +"="+(a*3)); */
		for(int i=1; i<10; i++) {
			System.out.println(a+"*"+i+"="+(a*i));
		}
	}

}
