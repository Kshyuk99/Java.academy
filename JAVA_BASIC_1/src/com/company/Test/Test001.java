package com.company.Test;

import java.util.Scanner;

public class Test001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i==1) {System.out.println("1이다.");}
		else if(i==2) {System.out.println("2이다.");}
		else if(i==3) {System.out.println("3이다.");}
		else {System.out.println("1,2,3이 아니다.");}
	}

}
