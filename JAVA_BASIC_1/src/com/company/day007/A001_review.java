package com.company.day007;
import java.util.*;
//Q1
//Object Oriented Programming

//Q2
 /*클래스를 조립해 완성된 프로그램을 만드는 기법*/

//Q3
/* class : 부품객체, 상태(멤버변수) + 행위(멤버함수)
   instance : 각 객체들의 각기 다른속성
   클래스(틀, 설계도) -> 인스턴스화(실제메모리 빌려서 만듬) -> 객체(인스턴스[들])
   												인스턴스(각각의 특징)
*/

//Q4~6
/*1. new -1000번지 heap 메모리빌리기, 객체생성
 2. A11() - String null, int 0 초기화
 3. a1 -1000번지
 4.초기화 / new 호출시  / 리턴값 X
 5.오버로딩 / 상속
 
  
*/

//Q7

	
class TV{
	
	String channel;
	int volume;
	
	void show(){ System.out.println(channel + "\t" + volume);}
	void input() {Scanner sc = new Scanner(System.in);
	System.out.print("channel - volume 입력 >");
	}
	public TV() {
		super();
		
	}
	public TV(String channel, int volume) {
		super();
		this.channel = channel;
		this.volume = volume;
	}
	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + "]";
	}

	
}



public class A001_review {
	public static void main(String[] args) {
		TV a1 = new TV("MBC", 6); a1.show();
		TV a2 = new TV(); a2.input(); a2.show();
		
		
		
		
		
	}

}
