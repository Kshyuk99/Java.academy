package com.company.day007;

// final 나혼자 사용
//3) 클래스 - 자식에게 안물려줌  자식에서 extends가 안됨
final class FinalEx extends Object{ // Object 자바팀이 만들어놈 이런객체틀로 만들어
	//1) 상수는 안변하는 값 : 기본값
	final static String XMAS = "12-25";
	String name;
	//2) 메서드에붙으면 상속받는 자식이 오버라이드 할수없음
	// 자식이 부모가 가진 메서드를 가져다가 개조해서 맞게 사용할께
	 //void show() { //2-1 final 빼기
	final void show() { //2-3 자식한테 안물려줌 2-4 에러확인
		System.out.println(XMAS + " / " + name);
	}
	public FinalEx() {super(); }  // Object()
	
	
}
/*
class Son2 extends FinalEx{

	//@Override void show() {super.show();}//2-2 문제없음
	//@Override void show() {super.show();}//2-4 error
	
} */

public class Class010_final {
	public static void main(String[] args) {		
		FinalEx f1 = new FinalEx();
		//f1.XMAS="01-17";  // cannot be assigned 수정못함.
		f1.name="크리스마스";
		f1.show();
	}

}
