package com.company.day006;
//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수) + 행위(멤버함수)
class A7{
	// 상태(멤버변수)
	int a;  //인스턴스변수 (new O, this 각각 생기는)
	static String company ="BANA";  // static(클래스) 변수 , new X , this X
	
	public A7() {}
	public A7(int a) { this.a = a;}  // this 1번의 a, 2번의 a, 3번지의 a
	// 행위(멤버함수)
	void show() {int b=0;  System.out.println(b);}  //## int b= 지역변수  초기화
}


public class Class007 {
	public static void main(String[] args) {
		System.out.println(A7.company); // 클래스명.company  / new (X) 그냥사용가능
		A7 a7 = new A7();  //3. 1) new(heap메모리, 객체생성) 2) A() 초기화  3) a7=번지
		a7.show();
	}

}
/*  RUNTIMEDATA AREA 
--------------------------------
[method : 정보, static, final]  A7 , Class007 , company ="BANA"
--------------------------------
[heap : 동적]    				|[stack: 잠깐빌리기]
							a7.show() --- void show(){ int b=0; } 지역변수는 초기화필요
1번지 A7(a=0)            <- a7[1번지]

               				| main()
---------------------------------
*/