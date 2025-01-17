package com.company.day007;
import com.company.day007_etc.Cat;

class Cat2 extends Cat{// Cat 기존 -> Cat2 [Cat의 기능 끌어다가 사용]

	public Cat2() {super();} 
	public void show() {
		pub = 1;// public 아무데서나 접근가능
		pro=2; //protected는 extends 사용한 안쪽사용  자식
		//pac=3; Cat클래스와 같이 있지않음  - 같은폴더
		//	pri = 4;
		System.out.println("public/protected : " + pub + "/" + pro);
	}
}

public class Class012_Modifier_protected {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.pub=1;  	//public 아무데서나 접근가능
		//cat.pro=2;   // protected 상속받은 자식 - extends
		//cat.pac=3;  // package 같은 폴더(package)
		//cat.pri=4;  // private Cat이라는 클래스 내부에서만
		Cat2 cat2 = new Cat2();
		cat2.show();
		cat2.pub=10; //protected
		//cat2.pro=20;  외부클래스 protected 사용불가
	}

}
//1. package - day007_etc
//2. 			day007_etc.Cat 클래스파일
//3. day007 - Class012_Modifier