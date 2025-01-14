package com.company.day004_array;
// 두수 사이의 합
import java.util .Scanner;
public class A002_puls_2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자1입력: ");
		int a = sc.nextInt();
		System.out.println("숫자2입력: ");
		int b = sc.nextInt();
		int sum = 0;
		if(a>b) {
			int m = a;
			a=b;
			b=m;
		}
			for(int i=a; i<=b; i=i+1) {
				sum=sum+i;
			}
				System.out.println();
				
				System.out.println(sum);	
				
			
	}	

}
