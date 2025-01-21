package com.company.day009;



interface Launch{
	int Money = 10000;
	void eat();
}
class Burger implements Launch{
	int price;
	public Burger() {System.out.println("버거하나요");this.price = 3900;}
	@Override public void eat() { System.out.println("Burger 냠냠");  }
	@Override public String toString() { return "Burger"; }
	
}
class KimchiStew implements Launch{
	int price;
	public KimchiStew() {System.out.println("김치찌개하나요");this.price=4000;}
	@Override public void eat() {  System.out.println("KimchiStew 냠냠"); }
	@Override public String toString() { return "KimchiStew"; }
	
}
class User{
	int money; // 돈체크
	int cnt;   // plate 갯수
	Launch []plate;  // 기본은 3개짜리
	User(){money = Launch.Money; plate = new Launch[3]; cnt=0;}
	void order(Launch a) {
		if(cnt >= plate.length) { // 현재배열의 갯수(접시갯수가) >= 갖고있는 접시갯수 / 배열이 꽉찼다면
			Launch[] temparr = new Launch[3+plate.length]; //현재배열공간 +3(6,9,12,,)
			System.arraycopy(plate, 0, temparr, 0, plate.length);//#데이터 복사해오고(원본, 0, 새로운배열, 0, 갯수)
			plate = temparr;
		}
		//1. 주문한 메뉴의 값 확인
		//2. 내가 가진돈 빼기
		//3. 주방에 주문들어간 plate 확인
	}
	void show() {
		//4. 보이는대로 출력
		System.out.println(">> 잔액이 부족해 더이상 주문이 불가능합니다");
		//System.out.println("주문 : " +  );
	}
}

public class Interface004 {
	public static void main(String[] args) {
		User launchorder = new User();
		launchorder.order(new Burger()); // 주문메뉴확인
		launchorder.order(new KimchiStew()); // 리턴값 메서드명(파라미터: Burger, KimchiStew)
		launchorder.order(new Burger()); 	 // void order( Launch a )
		launchorder.show();// 메뉴출력  void show() {}
	}
}
/*
	Launch	(Money = 10000/void eat())				   
   ↑        ↑       
Burger    KimchiStew
*/