package com.company.day011_thread;

import java.awt.Toolkit;

//1. 프로세스 - 실행중인 프로그램
//2. 프로세스 - 자원(데이터, 메모리) + Thread(실제 작업)

public class Thread001 {
	public static void main(String[] args) {
		System.out.println("001. Thread");
		//1. 코어 (일꾼수)
		int core = Runtime.getRuntime().availableProcessors();
		System.out.println("1. core(일꾼수) : " + core);		
		
		//2. 현재스레드(실행프로그램) 확인
		Thread curr = Thread.currentThread();
		System.out.println("2. 현재스레드(실행프로그램) 이름 : " + curr.getName());
		System.out.println("3. 활성화스레드(실행프로그램) 수 : " + Thread.activeCount());
		
		//#1. ˙Ꙫ˙
		for(int i=0; i<5; i++) {
			System.out.println("˙Ꙫ˙");
			try { Thread.sleep(1000); } catch (InterruptedException e) {  e.printStackTrace(); }
		}
		//#2. 비프음
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			System.out.println("꿀");			
			//toolkit.beep();
			try { Thread.sleep(1000); } catch (InterruptedException e) {  e.printStackTrace(); }
		}
	}

}
