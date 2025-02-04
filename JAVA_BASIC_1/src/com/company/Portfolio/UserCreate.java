package com.company.Portfolio;

import java.util.ArrayList;
import java.util.Scanner;

public class UserCreate implements UserProcess{
	@Override
	public void exec(ArrayList<UserInfo> users) {
		System.out.println("..........1. create");
		Scanner sc = new Scanner(System.in);
		System.out.println("name > ");   String name = sc.next();
		System.out.println("email > ");  String email = sc.next();
		//사용자 이름 입력받기
		//이메일입력받기		
		users.add(new UserInfo(name, email));
	}
}

