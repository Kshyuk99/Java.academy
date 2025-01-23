package com.company.day011_thread;

class Barista5{
	String order;
	boolean isEmpty = true; //#1 상태표시 
	
	synchronized void order(String order) { // 동기화 - 보장
		//#2 음료를 가져가지 않았다면  !(빈게)아니라면 -> 꽉찼다면 -> 기다려  11번째줄 stop #4번 진행X
		if(  !isEmpty) {try { wait(); } 
		catch (InterruptedException e) {  e.printStackTrace(); } }
		isEmpty=false;  this.order = order;//#4
		System.out.println("["+order+"] 주문을 받았습니다."); notify();
	}
	synchronized void make(){
		//#3 음료가 나오지않았다면 기다리기  비었다면 -> 기다려  18번째줄 stop 진행불가
		if( isEmpty) {try { wait(); } 
		catch (InterruptedException e) {  e.printStackTrace(); }}
		isEmpty = true; // 음료가 나왔다면 가져감  상태는 비었음
		System.out.println("["+order+"] 음료 나왔습니다.");
		notify(); // wait 깨우기
	}
}
public class Thread005 {
	public static void main(String[] args) {
		Barista5 one = new Barista5(); // 공용자원사용
		String [] coffees = {"아메리카노" , "카푸치노", "바닐라라떼", "딸기요거트"};
		Thread ordering = new Thread( new Runnable() { //#1. 수행클래스
			@Override public void run() {  //#2. 해야할일
				for(int i=1; i<=5; i++) {
					one.order("주문번호 " + i + coffees[ (int)(Math.random()*4)] );
				}
			}
			
		});
		
		
		Thread making = new Thread( new Runnable() {//#1. 수행클래스
			@Override public void run() { //#2. 해야할일
				for(int i=1; i<=5; i++) {
					one.make();
				}
			}
			
		});
		ordering.start();  making.start();
	}

}
