package com.company.day003_reapeat;
import java.util.Scanner;
public class A001_break {
	public static void main(String[] args) {
		//1,2,3,4,5,9,7,8,9,10
		for(int i=1; i<=10; i++) {
			System.out.print(i+ "\t");
		}
		System.out.println("for break");  //결과적기 1  2  (3되면 빠져나오기)
		for(int i=1; i<=10; i++) {
			if(i==3) {break;}
			System.out.print(i+ "\t");
		}
		System.out.println("for continue");
		// 결과적기 1,2(3만 빠짐),4,5,6,7,8,9,10
		for(int i=1; i<=10; i++) {
			if(i==3) {continue;}
			System.out.print(i+ "\t");
		}
		System.out.println("무한 반복");
		int a=0;
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.print("숫자 한개 입력> ");
			a= sc.nextInt();
			if(a ==1) {break;}
		}
		System.out.println(a);
	}

}
