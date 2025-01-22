package com.company.selftest;
import java.util.Scanner;
class Test{
	String name;
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 이름을 입력하세요");
		name = sc.next();
	}
	void show() {
		System.out.println("당신의 이름은 " + name + " 입니다");
	}
}

public class Selftest003 {
	public static void main(String[] args) {
		Test t = new Test();
		t.input();
		t.show();
	}

}
