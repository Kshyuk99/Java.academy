package com.company.day006;
import java.util.Scanner;
//1. 클래스는 부품객체
//2. 클래스는 속성과 행위
class Animal002{
	// 속성-멤버변수
	String name;
	int age;
	// 행위-멤버함수
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("name > "); name = sc.next();
		System.out.println("age > ");  age = sc.nextInt();
	}
	void show() {System.out.println(name + "\t" + age);}
}
//////////////////////////////
public class Class002 {
	public static void main(String[] args) {
		Animal002 ani = new Animal002();
		//				1. new (heap 공간빌리기) 1000번지
		//				2. Animal002()  name = null, age=0 초기화셋팅
		//				3. ani = 1000번지
		ani.input();
		ani.show();
	}

}
/* 3. A1 a = new A1();  
--------------------------------
[method : 정보, static, final] Animal002, Class002
--------------------------------
[heap : 동적]    				|[stack: 잠깐빌리기]
1000번지 Animal(name:"sally", age:10) <-ani.show() 1000번지따라가서 show
1000번지 Animal(name:"sally", age:10) <-ani.input() 1000번지따라가서 input
1000번지 Animal(name:null, age:0) <- ani (1000번지)
                			| main
---------------------------------
*/