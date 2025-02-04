package com.company.Portfolio;

import java.util.ArrayList;
import java.util.Scanner;

public class Test002_controller {
	public static void main(String[] args) {
		// model(저장소)
		ArrayList<UserInfo> list = new ArrayList<>();
		list.add(new UserInfo("aaa", "aaa@gmail.com"));
		list.add(new UserInfo("bbb", "bbb@gmail.com"));
		list.add(new UserInfo("ccc", "ccc@gmail.com"));
		
		Scanner sc = new Scanner(System.in);
		UserProcess controller=null;  // 부모 - 인터페이스 - 설계
		UserProcess [] crud = {
				new UserCreate(), new UserRead(), new UserUpdate(), new  UserDelete()
		};		
		
		
		
		int num=-1;
		for(;;) {
			System.out.print("\nmenu - 1.create 2.read 3.update 4.delete 5.exit  \n입력>");
			num = sc.nextInt();
			 if(num==5) {System.out.println("end"); break;}
			 else if(num==1) {controller = crud[0]; controller.exec(list);} // null -> list
			 else if(num==2) {controller = crud[1]; controller.exec(list);}
			 else if(num==3) {controller = crud[2]; controller.exec(list);}
			 else if(num==4) {controller = crud[3]; controller.exec(list);}		 
		}		
	}
}
//controller = crud[0]; controller.exec(null);
		//controller = crud[1]; controller.exec(null);
		//controller = crud[2]; controller.exec(null);
		//controller = crud[3]; controller.exec(null);
		
		//1. 무한반복
		//2. 사용자에게 번호입력받기, 1을 입력받으면 추가 controller = crud[0]; controller.exec(null);
		//					   2을 입력받으면 추가 controller = crud[1]; controller.exec(null);
		//					   3을 입력받으면 추가 controller = crud[2]; controller.exec(null);
		//					   4을 입력받으면 추가 controller = crud[3]; controller.exec(null);
		//					   5입력 종료