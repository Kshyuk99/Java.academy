package com.company.day009;

class A11{
	int a;//1 인스턴스변수
	public A11(){ super(); }
	public A11(int a){ super(); this.a = a; }
	//2 int a/지역변수
	void show() {this.a=11; System.out.println(this.a);}
	//3. 인스턴스메서드
	//static void classMethod() {this.a=12;}
	//4. 클래스메서드
	int show2() {int a=0; return a;}
	//5. 인스턴스메서드 - int a; 지역변수 / 초기화자동화X
}
public class Repeat1 {
	public static void main(String[] args) {
		A11 a1 = new A11();
		//Q3. 1) new : 메모리빌리기, 객체생성
		//	  2) A11() : String null, int 0 초기화
		//	  3) a	    : 번지
	}

}
/*  
3. A1  a = new A1(); 
-----------------------------------
[method: 정보, static, final]  A11, Repeat
-----------------------------------
[heap:동적]       |[stack: 잠깐빌리기]
[1번지] A11{a / show/show2}
                 |
-----------------------------------
*/

/*Q2
 4번 - 클래스 메서드에서 this 사용불가
 5번 - int show2(){int a=0;} 지역변수 초기화
 */


  
/*Q4 기본생성자 반드시 선언 : 오버로딩, 상속*/ 

/*Q5 c, d */

