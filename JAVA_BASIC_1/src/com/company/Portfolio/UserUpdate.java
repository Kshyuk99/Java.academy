package com.company.Portfolio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UserUpdate implements UserProcess{
	@Override public void exec(ArrayList<UserInfo> users) {
		System.out.println("..........3. update");
		//1. 사용자 수정할 번호 입력받기
		//2. 사용자 수정할 이메일 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("no > ");     int no = sc.nextInt();
		System.out.print("email > ");  String email = sc.next();
		
		Iterator<UserInfo> iter=users.iterator();  //1)줄을 서시오
		while(iter.hasNext()) {  //2)처리대상확인
			UserInfo t= iter.next(); //3)꺼내오기
			//if( no가 2이라면 ) { abc@gmail.com으로 변경  }
			if(t.getNo() == no) {  t.setEmail(  email  ); break; }
		} 
		
	}
}
