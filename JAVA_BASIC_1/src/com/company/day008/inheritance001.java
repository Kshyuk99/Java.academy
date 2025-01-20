package com.company.day008;

//1. 클래스는 부품객체
//2. 부품객체는 상태와 행위
//3. 상속 재사용
//4. Object 상속 - alt + shift + s (기본생성자)

/* Object {} 
    ↑
	A1     int a
	↑
	B1     int b
	↑
	C1     int c
*/
class A1 extends Object{ int a;  public A1() { super(); } }
class B1 extends A1	   { int b;  public B1() { super();  } }// ctrl+alt +j
class C1 extends B1 { // ctrl+shif+f
	int c;
	public C1() { super(); }
	public void show() {System.out.println(a+"/" + b+"/" + c);}
}
public class inheritance001 {
public static void main(String[] args) {
	C1 c1 = new              C1();  c1.c = 30;  c1.b=20;  c1.a=10;  c1.show();
			// 1. new: 메모리, 객체생성  2. C1()-> B1() -> C1() -> Object()

	}

}
/*  
3. C1 c1 = new C1();    25번째줄
-----------------------------------
[method: 정보, static, final]  A1, B1, C1,   public inheritance001
-----------------------------------
[heap:동적]       |[stack: 잠깐빌리기]
           Object(){#4  }#5 틀만들기   Object 틀을 사용할수 있게 만듬
     a=0         A1(){#3}#6 a사용가능  인스턴스변수 초기화해 사용가능하게
     b=0         B1(){#2}#7 b사용가능  인스턴스변수 초기화해 사용가능하게
1번지 c=0         C1(){#1}#8 c사용가능  인스턴스변수 초기화해 사용가능하게
                 |  main
-----------------------------------
*/