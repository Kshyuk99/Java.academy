package com.company.day003_reapeat;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		boolean run = true;
		int balance =0;
		Scanner sc = new Scanner(System.in);
		for(;run;) {
		System.out.println("==========BANK==========");
		System.out.println("* 1. 추가\n* 2. 조회\n* 3. 입금\n* 4. 출금\n* 5. 삭제\n* 9. 종료 ");		
		System.out.println("입력 >> ");
		int i = sc.nextInt();
		if(i==9) {
			System.out.println("종료");
			run = false;
		}
		else if(i==1) {
		System.out.println("아이디 입력 : ");
		String id = sc.next();
		
		System.out.println("비밀번호 입력 : ");
		String pw = sc.next();
		
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		
		System.out.println("잔액 입력 : ");
		run = true;
		}
		else if(i==2) {
			String id = sc.next();
			String pw = sc.next();
			System.out.println("다시 확인해주세요");
		}
		else if(i==3) {
			System.out.println("==입금완료");
		}
		
		else if(i==4) {
			System.out.println("==출금완료");
		}
		
		else if(i==5) {
			System.out.println("계좌를 삭제하시겠습니까?");
		}
		
	  }
   }
}
