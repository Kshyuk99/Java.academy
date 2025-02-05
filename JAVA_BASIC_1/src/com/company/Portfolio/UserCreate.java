package com.company.Portfolio;

import java.util.ArrayList;
import java.util.Scanner;

public class UserCreate implements UserProcess{
	@Override public void exec(ArrayList<UserInfo> users) {
		System.out.println("..........1. create");
		Scanner scanner = new Scanner(System.in);
		System.out.print("name > ");   String name = scanner.next();
		System.out.print("email > ");  String email = scanner.next();
		//사용자이름 입력받기
		//이메일입력받기
		users.add(  new UserInfo( name , email) );
	}
}
