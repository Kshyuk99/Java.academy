package com.company.bank;
//무한반복을 이용해서 메뉴판 실행
import java.util.Scanner;
public class Bank2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.println("======BANK======\r\n"
					+ "1. 추가\r\n"
					+ "2. 조회\r\n"
					+ "3. 입금\r\n"
					+ "4. 출금\r\n"
					+ "5. 삭제\r\n"
					+ "9. 종료\r\n"
					+ "선택>>>>>>>");
			int menu = sc.nextInt();
			
			if(menu == 9) {break;}
			else if(menu==1) {
				System.out.println("아이디 입력 : ");
				String id = sc.next();
				
				System.out.println("비밀번호 입력 : ");
				String pw = sc.next();
				
				System.out.println("나이 입력 : ");
				int age = sc.nextInt();
				
				System.out.println("잔액 입력 : ");
				continue;
				}
				else if(menu==2) {
					String id = sc.next();
					String pw = sc.next();
					System.out.println("다시 확인해주세요");
				}
				else if(menu==3) {
					String id = sc.next();
					String pw = sc.next();
					System.out.println("==입금완료");
				}
				
				else if(menu==4) {
					String id = sc.next();
					String pw = sc.next();
					System.out.println("==출금완료");
				}
				
				else if(menu==5) {
					String id = sc.next();
					String pw = sc.next();
					System.out.println("계좌를 삭제하시겠습니까?");
				}
				
		}
		
	}

}
