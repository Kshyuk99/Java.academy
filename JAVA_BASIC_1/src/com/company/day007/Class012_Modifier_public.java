package com.company.day007;
import com.company.day007_etc.Cat;

public class Class012_Modifier_public {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.pub=1;  	//public 아무데서나 접근가능
		//cat.pro=2;   // protected 상속받은 자식 - extends
		//cat.pac=3;  // package 같은 폴더(package) Cat이랑 같은 폴더가 아님
		//cat.pri=4;  // private Cat이라는 클래스 내부에서만
	}

}
//1. package - day007_etc
//2. 			day007_etc.Cat 클래스파일
//3. day007 - Class012_Modifier