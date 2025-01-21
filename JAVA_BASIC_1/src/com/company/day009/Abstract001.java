package com.company.day009;

//설계목적 : abstract클래스는 추상화정도가 떨어짐 / 인스턴스 사용가능
abstract class Animal1{
	String name; int age; //
	abstract void eat(); // 추상메서드가 있으면 반드시 추상클래스로 만들어줘야함 (고양이, 강아지,, 공통속성)
	abstract void sleep(); // 추상메서드 {} 구현부분이 없음 - 공통의속성 구체적인 내용이 없음
	abstract void poo();  // 일반화, 추상화, 설계 : 공통적인속성, 행동
}
class Cat extends Animal1{
	@Override void eat() { System.out.println(name + " 고양이 냠냠");  }
	@Override void sleep() { System.out.println(name + " 코");  }
	@Override void poo() { System.out.println(name + " 시원");  }// 고양이는 -> 동물이다 / abstract 무조건구현	
}
class Dog extends Animal1{
	@Override void eat() { System.out.println(name + " 강아지 냠냠");  }
	@Override void sleep() { System.out.println(name + " 코");  }
	@Override void poo() { System.out.println(name + " 시원");  }
}

public class Abstract001 {
	public static void main(String[] args) {
		//Animal1 ani = new Animal1();
		//1) new 메모리빌리고, 객체생성  2) Animal() 초기화 X 3) {} 구현부분이 없음
		Animal1 ani = new Cat(); // 부모 = 자식, 업캐스팅, 타입캐스팅X 부모는 자식을 담을 수 있다
		ani.name="abc"; ani.age=7; ani.eat(); ani.sleep(); ani.poo();
		ani = new Dog();// 부모는 자식을 담을 수 있다
		ani.name="alpha"; ani.eat(); ani.sleep(); ani.poo();
		///////  사용목적 : abstract은 this(인스턴스사용가능)
		Animal1 []arr = {new Cat(),new Cat(),new Dog(),new Dog()};
		//한개의 자료형으로(Animal1) 여러타입 관리하려고 사용함
		arr[0].name="cat-a"; arr[1].name="cat-b"; arr[2].name="dog-a"; arr[3].name="dog-b";
		for(int i=0; i<arr.length; i++) {
			arr[i].eat();
		}
	}
}
