package com.company.day010_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//0. dto
//1. 클래스는 부품객체  2. 상태(name, age)와 행위
// getter/setter, alt+shift+s : 2,3,4
class UserInfo{
	private String name;
	private int age;
	
	public UserInfo() { super();  }	
	public UserInfo(String name, int age) { super(); this.name = name; this.age = age; }
	@Override public String toString() { return "UserInfo [name=" + name + ", age=" + age + "]"; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
}
// List -순서 O, 중복O/ add, get size, remove, contains
public class List003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<UserInfo> users = new ArrayList();
		users.add(new UserInfo("Iron",50));
		users.add(new UserInfo("Hulk",40));
		users.add(new UserInfo("Captain",120));
		//System.out.println(users.get(0));
		//System.out.println(users.get(1));
		//System.out.println(users.get(2)); // for문으로 줄이기
		System.out.println("== USERINFO == ");
		for(int i=0; i<users.size(); i++) {  System.out.println(users.get(i)); }
		
		System.out.print("User 정보입력 > "); String name = sc.next();
		if(name.equals(users.get(0).getName())) {System.out.println(users.get(0));  }
		if(name.equals(users.get(1).getName())) {System.out.println(users.get(1));  }
		if(name.equals(users.get(2).getName())) {System.out.println(users.get(2));  }		
	}

}
