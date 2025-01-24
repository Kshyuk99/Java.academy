package com.company.selftest;

import java.util.Scanner;

public class Selftest003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력받으세요");
		String name = sc.next();
		System.out.println("당신의 이름은 " + name + "입니다");
	}

}
