package com.company.day007;

import java.util.Arrays;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수)
class A{ //DTO  -  data transfer object
	private String name;  // A클래스 내부에서
	private int age;  //getter+setter
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	@Override
	public String toString() {return "A [name=" + name + ", age=" + age + "]";}
	
}// 생성자를 손대지않는 이상(오버로딩) 컴파일러가 자동생성

public class Class014_classArr {
	public static void main(String[] args) {
		A a = new A();  // 1) 공간빌리기, 객체생성 2) A() 초기화 null, 0  3) a=1번지
		System.out.println(a);
		
		// todo) 클래스배열
		A[] arr = new A[3];  //new 공간빌리기 - 배열(같은자료형 연결) A(클래스자료형) 3개공간만 빌리기
							 //3개  : 0~2 arr[0],    arr[1],       arr[2]
							 //		 {name , age}   {name , age}   {name , age}
		System.out.println(Arrays.toString(arr) ); // [null, null, null]
		//todo2) 각공간에 생성자를 불러서 초기화
		arr[0] = new A();
		//todo3) setter/getter 이용해서 사용
		arr[0].setName("apple");  arr[0].setAge(10); System.out.println(arr[0]);
		
	}

}






