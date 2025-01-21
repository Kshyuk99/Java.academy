package com.company.day009;

//1. 클래스는 부품객체
//2. 부품객체는 상태 + 행위
//	인터페이스 상태(멤버변수): public static final (상수)
//  인터페이스 행위(멤버함수): public abstract		: {} 구현부가 없음
//  abstract 클래스보다 추상화 정도가 높다
interface Animal{
	String NAME="홍갈동";  // static - method area, new 관련X, new 보다 먼저 메모리상 위
	void eat();  // {}구현부가 없으므로 new 못함
}
class Saram implements Animal{ // extends(확장) 인스턴스화(메모리상)
	@Override public void eat() {/*NAME="IU";*/ System.out.println("밥 식사");   }
	
}
class Pig implements Animal{
	@Override public void eat() {/*NAME="IU";*/ System.out.println("밥 ");   }
}

public class Interface001 {
	public static void main(String[] args) {
		//Animal ani = new Animal(); error
		System.out.println(Animal.NAME);
		Animal [] ani = {new Saram(), new Saram(), new Pig(), new Pig()};
		// 한꺼번에 여러개의 타입을 관리하려고 사용
		for(Animal a : ani) {a.eat();} // Override - 자식 eat()
	}

}
