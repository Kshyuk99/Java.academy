package com.company.day011_thread;
// 프로세스 - 실행중 프로그램
// 자원 + Thread(작업수행)
class PigShow extends Thread{  //#1. 상속  Thread(작업수행클래스)
	@Override public void run() { //#2. run - 작업수행클래스가 해야할일
		try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
		for(int i=0; i<5; i++) {
			System.out.println("˙Ꙫ˙");
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) {  e.printStackTrace(); }
		}// end for
	}  
	
}// end show

class PigSound extends Thread{  //#1. 상속  Thread(작업수행클래스)
	@Override public void run() { //#2. run - 작업수행클래스가 해야할일
		for(int i=0; i<5; i++) {
			System.out.println("꿀");	
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) {  e.printStackTrace(); }
		}
		
	}// end run
	
} // end sound

class PigCnt extends Thread{  // #1. 작업수행클래스 상속
	//#2. 1~5까지 출력
	@Override public void run() {  
		for(int i=1; i<6; i++) {
			System.out.println("COUNT : " + i);
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) {  e.printStackTrace(); }
		}
		
	}
	
} // end cnt

public class Thread002 {
	public static void main(String[] args) {  // 실행클래스
		Thread show = new PigShow();  show.start(); // 부모 = 자식  #3. start
		Thread sound = new PigSound(); sound.start();
		Thread cnt = new PigCnt(); cnt.start();
	}// end main
}// end class
