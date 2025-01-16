package com.company.day006;


public class Class006 {
	public static void main(String[] args) {
		InitNum car = new InitNum();  //3. 1)1번지 new (heap 메모리, 객체생성)  2) InitNum() String null, int 0
									  //   3)car = 1번지
		System.out.println(car);
	}

}
//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수) + 행위(멤버함수)
class InitNum{
	//멤버변수
	String name="BMW"; int speed;
	{ name="벤츠"; speed=150; }
	//생성자 손대면 기본생성자 자동생성X
	//alt + shift + s - 밑에서 2,3,4
	public InitNum() { name="아우디";	}
	public InitNum(String name, int speed) {super();this.name = name;this.speed = speed;}
	//멤버함수
	@Override
	public String toString() {return "InitNum [name=" + name + ", speed=" + speed + "]";}
	
}

/* RUNTIMEDATA AREA  - InitNum car = new InitNum();
--------------------------------
[method : 정보, static, final] Class006, InitNum
--------------------------------
[heap : 동적]    						|[stack: 잠깐빌리기]
1번지 : InitNum
InitNum(name  ,  speed)  
	  기본값 -> 명시적 초기화 -> 초기화블록 -> 생성자
name   null    BMW          벤츠       아우디
speed    0      0           150       150

									| main
---------------------------------
*/