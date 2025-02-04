package com.company.Portfolio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UserDelete implements UserProcess{
	@Override
	public void exec(ArrayList<UserInfo> users) {
		System.out.println("..........4. delete");
		Scanner sc = new Scanner(System.in);
		System.out.println("no > ");  int no =sc.nextInt();
		System.out.println("email > "); String email = sc.next();
		
		Iterator<UserInfo> iter = users.iterator(); //1)줄세우기
		while(iter.hasNext()) { //2)처리대상 확인
			UserInfo t = iter.next(); //3)꺼내오기
			if(t.getNo()==no) { iter.remove();  break; }			
		}
		System.out.println(users);
	}
}


