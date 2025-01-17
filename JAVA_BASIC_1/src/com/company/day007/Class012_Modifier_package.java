package com.company.day007;

public class Class012_Modifier_package { // extends Cat을 한적이 없음
	public static void main(String[] args) {
		Cat2 cat = new Cat2();	 
		// import 안해도 사용가능
		// 같은 폴더(package)에 있음
		cat.pub=10;  //public 아무데서나 사용가능
		//cat.pro=20;  // extends 키워드를 사용했다면 사용가능
		//cat.pac=30;	 // Cat2와는 같은 폴더내에는 있지만 외부 not visible
		//cat.pri=40;  // Cat 클래스안에서만 사용가능
		cat.show();
	}

}
