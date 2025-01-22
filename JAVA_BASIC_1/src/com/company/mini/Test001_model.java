package com.company.mini;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Q1. Dto
//1. 클래스는 부품객체  2. 상태(name, age)와 행위
class Info{
	//상태(멤버변수)
	public static int cnt=0;  //## 클래스변수  ( method / new 먼저올라감 )
	private int no;			  //   인스턴스변수 ( heap / new O , 생성자, this)
	private String email;	  // 인스턴스변수
	public Info() { super();  }
	
	public Info(String email) { super(); this.no= ++cnt; this.email = email; } //#
	public Info(int no, String email) { super(); this.no = no; this.email = email; }
	@Override public String toString() { return "Info [no=" + no + ", email=" + email + "]"; }
	//행위(멤버함수)
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }	
}

public class Test001_model {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Info> list = new ArrayList<Info>();
		list.add(new Info("aaa@gmail.com"));
		list.add(new Info("bbb@gmail.com"));
		list.add(new Info("ccc@gmail.com"));
		System.out.println(list);
		// (한개의 데이터 : 배열,객체)
		for(Info i : list) {System.out.println(i.getNo() + "/" + i.getEmail());}
		
		for(Info i : list) {
			Info data = i;
			if(data.getNo()==1) {data.setEmail("abc@gmail.com");}
		}
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
	}

}
