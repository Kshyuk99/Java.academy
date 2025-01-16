package com.company.day006;

//1. 클래스는 부품객체
//2. 클래스 상태(멤버변수) + 행위(멤버함수)
class Car6{
	String name="아우디";  int speed;
	{ name="BMW";   speed=120; }
	//alt + shift + s  
	public Car6(String name, int speed) { super(); this.name = name; this.speed = speed; }
	public Car6() { super(); }// 생성자 손대면 기본생성자 자동생성X
	@Override public String toString() { return "Car6 [name=" + name + ", speed=" + speed + "]"; }
}
public class Class006_init {
	 public static void main(String[] args) {
		 Car6 car61 = new Car6();            System.out.println(car61);// 사용자가 잘모를경우
		 Car6 car62 = new Car6("벤츠" , 150); System.out.println(car62); 
		 Car6 car63 = new Car6("EV6" , 120); System.out.println(car63); 
	}
}

/*	
 > 1. 초기화순서  
  	  기본값 -> 명시적 초기화(name="아우디") -> 초기화블록({ name="BMW";   speed=120; }) -> 생성자
name  null   아우디						BMW										BMW
speed  0      0							120										120

> 2. this
1. 클래스(붕어빵틀-설계도)  2. 객체( car61,car62,car63)  3. 인스턴스(각각의 특징)
													this

   RUNTIMEDATA AREA    
-------------------------------------------------------------
[method: 정보, static, final]     Car6, Class006  
-------------------------------------------------------------
[heap:동적]                           |[stack: 잠깐빌리기]
3번지 Car6(){name="EV6" , speed=120} <- car63 [3번지]  this.name  내2번지의  name
2번지 Car6(){name="벤츠" , speed=150} <- car62 [2번지]  this.name  내2번지의  name
1번지 Car6(){name="BMW" , speed=120} <- car61 [1번지]
								     | main
-------------------------------------------------------------
*/

