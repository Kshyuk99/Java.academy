package com.company.bank;
//무한반복을 이용해서 메뉴판 실행
import java.util.Scanner;
public class Bank2 {
	public static void main(String[] args) {
		int menu=-1;
		String id="", pw=""; int balance=0;
		Scanner sc = new Scanner(System.in);
		for(;menu==9;) {
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
				
			 }
			else if(menu==9) {System.out.println("종료기능입니다"); break;}
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
			
			
			   if(menu==2) {
				System.out.println("아이디 입력 : ");
				 id = sc.next();
				
				System.out.println("비밀번호 입력 : ");
				 pw = sc.next();
				
				System.out.println("나이 입력 : ");
				int age = sc.nextInt();
				
				System.out.println("잔액 입력 : ");
				continue;
				}
				else if(menu==3) {
					 id = sc.next();
					 pw = sc.next();
					System.out.println("다시 확인해주세요");
				}
				else if(menu==4) {
					 id = sc.next();
					 pw = sc.next();
					System.out.println("==입금완료");
				}
				
				else if(menu==5) {
					 id = sc.next();
					 pw = sc.next();
					System.out.println("==출금완료");
				}
				
				
				
		}
		
	}

}
}
