package com.company.selftest;
import java.util.Scanner;
public class Selftest012 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);        
        while (true) {
            System.out.print("1부터 100 사이의 숫자를 입력하세요: ");
            String input = sc.nextLine();             
            int num = 0;
            if (num >= 1 && num <= 100) {
                System.out.println("입력하신 숫자는 " + num + "입니다.");
                break;
            } 
        }
	      
	}
}
