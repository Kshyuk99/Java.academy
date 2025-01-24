package com.company.selftest;

class A11{
	int a;   // (1)  인스턴스변수
	A11(){   }
	A11(int a){  this.a = a;  }   //  (2)지역변수 
	//(3) void show()  인스턴스메서드
	void show() { this.a =11;   System.out.println(    this.a   ); }
	//(4) static void classMethod()  클래스메서드
	//static void classMethod() {   this.a = 12;  }
	//(5) int show2()  인스턴스메서드
	//int show2(){  int a;  return a; }
	int show2(){  int a=0;  return a; }
}
public class Selftest024 {
	public static void main(String []args) {  
		A11  a1  = new A11();    
	} // end main
} // end class
//Q1 인스턴스변수, 지역변수, 인스턴스메서드, 클래스메서드, 인스턴스메서드
/*Q2 int show2(){  int a=0;  return a; } 지역변수 초기화
static void classMethod() {   this.a = 12;  } 클래스메서드에서 this사용불가 */

//Q3 new ,A11(), a
//Q4 오버로딩, 상속