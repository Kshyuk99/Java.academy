package com.company.selftest;
import java.util.Scanner;
public class Selftest011 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
        int num;
        for (;;) { 
            System.out.print("1부터 100 사이의 숫자를 입력 :");
            while (!sc.hasNextInt()) {
                System.out.println("숫자를 입력");
                sc.next(); 
            }
            num = sc.nextInt();
            if (num >= 1 && num <= 100) {
                break; 
            } 
        }

        System.out.println(num);
	      
	}
}
