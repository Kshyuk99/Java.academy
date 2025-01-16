package com.company.bank;
import java.util.Scanner;
public class Bank_v2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = -1;
		String id="", pw=""; int balance=0;
		while(menu !=9) { // menu가 9가 아니면 무한반복
			System.out.println("======BANK======\r\n"
					+ "1. 추가\r\n"
					+ "2. 조회\r\n"
					+ "3. 입금\r\n"
					+ "4. 출금\r\n"
					+ "5. 삭제\r\n"
					+ "9. 종료\r\n"
					+ "선택>>>>>>>");
			 menu = sc.nextInt();
			 
			 if(menu==1) {
				System.out.println("\n\n1. 추가기능입니다. ");
				System.out.print("아이디 입력 : ");
				id = sc.next();
				
				System.out.print("비밀번호 입력 : ");
				 pw = sc.next();
				
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();
				
				System.out.print("잔액 입력 : ");
				balance = sc.nextInt();
				
			 		}else if(menu==9) {System.out.println("종료기능입니다"); break;}
			 		else {
			 			// 사용자정보조회
			 			System.out.print("아이디 입력 : "); 
			 			String id2 = sc.next();// id: 입력받기
			 			
			 			System.out.print("비밀번호 입력 : ");
						 String pw2 = sc.next();// pass: 입력받기
						 
						// 다시 확인해주세요 (추가기능에서 입력받은 아이디와 비번이 임시로 입력받은 아이디와 패스가 다르다면)
						 if( !(id.equals(id2) && pw.equals(pw2)) ) {
							 System.out.println("다시 확인해주세요"); continue; // 아래 진행 스킵
						 }			 			
			 			
			 			
			 			switch(menu) {
			 			case 2: System.out.println("\n\n2. 조회기능입니다"); break;
			 			case 3: System.out.println("\n\n3. 입금기능입니다"); break;
			 			case 4: System.out.println("\n\n4. 출금기능입니다"); break;
			 			case 5: System.out.println("\n\n5. 삭제기능입니다"); break;
			 			}
			 		}
					
					
			
		//1이면 사용자 정보입력받기
		//2이면 사용자정보조회 / 맞으면 정보출력
		//3이면 사용자정보조회 / 맞으면 입금할돈 받아서 입금 잔액추가
		//4이면 사용자정보조회 / 맞으면 출금할돈 받아서 출금 잔액빼기
		//5이면 사용자정보조회 / 맞으면 사용자정보 삭제
	}

  }
}
