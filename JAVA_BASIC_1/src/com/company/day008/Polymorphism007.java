package com.company.day008;


class Parent7{
	int x = 100;
	void method() {System.out.println("Parent Method");}
}
class Child7 extends Parent7{
	int x = 200;
	void method() {System.out.println("Child Method");}
}
public class Polymorphism007 {
	public static void main(String[] args) {
		Parent7 p = new Child7();  //Q3. Parent7 p 보장하는 범위 → ( x = 100 / method()) - Parent Method
		// Q4. 인스턴스화 했을때 사용가능한 범위 : new Child7() 
		// [1번지] Child7  (x = 200 / method() - Child Method) - ( x = 100 / -------)
		// Q9. 부모 = 자식 / 업케스팅/ 타입캐스팅X
		// p[1번지] = [1번지](x = 200 / method() - Child Method) - ( x = 100 / -------)
		Child7 c = new Child7();
		// Child7 c 보장내용 - (x = 200 / method() - Child Method) - ( x = 100 / -------)
		// c[2번지] = [2번지] (x = 200 / method() - Child Method) - ( x = 100 / -------)
		System.out.println("p.x = " + p.x);  //Q5. 출력되는 내용 p.x = 100
		p.method(); //Q6. 출력되는 내용 Child.method
		System.out.println("c.x = " + c.x);//Q7. 출력되는 내용  c.x = 200
		c.method();//Q8. 출력되는 내용  Child Method

	}

}
/*
Q1. 상속도 
Q2. 사용가능한 멤버변수 / 멤버함수
Object
	↑
Parent7 ( x = 100 / method() - Parent Method)
	↑
Child7  (x = 200 / method() - Child Method)
*/
