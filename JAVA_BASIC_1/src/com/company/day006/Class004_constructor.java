package com.company.day006;
//1. 클래스는 부품객체
//2. 클래스 속성(멤버변수)과 행위(멤버함수)
class Car41{}  // 3-4. Car41()  생성자를 안만들었을때 - 컴파일러가 기본생성자 자동생성
class Car42{
	String color;  
	public Car42(String color) {this.color = color; }
	// alt + shift + s - 오버로딩(같은이름메서드, 파라미터달라) - 컴파일러가 기본생성자 자동생성취소
	public Car42() { color = "black"; }  // 오버로딩시 수동으로 기본 생성자 만들기 / 기본셋팅 
	
}
public class Class004_constructor {
	public static void main(String[] args) {
		//           3-1. new - 1000번지 메모리, 객체생성
		//			 3-2. Car41() - 초기화, String null, int 0초기화
		// 			 3-3. car1 = 1000번지
		Car41 car1 = new Car41(); System.out.println(car1);
		Car42 car2 = new Car42("red"); System.out.println(car2);
		Car42 car22 = new Car42(); System.out.println(car22.color);
	}

}
/* 3. Car41 a = new Car41();  
--------------------------------
[method : 정보, static, final] A1, Class001
--------------------------------
[heap : 동적]    |[stack: 잠깐빌리기]
    A1{}       <- a
               | main
---------------------------------
*/