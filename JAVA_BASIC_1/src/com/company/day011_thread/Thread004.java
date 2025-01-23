package com.company.day011_thread;
import java.util.Scanner;
import javax.swing.JOptionPane;

class Timerb extends Thread{  //#1. 수행클래스
	@Override public void run() { //#2. 해야할일		
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) {  e.printStackTrace(); }
		}
	}
	
}



public class Thread004 {
	public static void main(String[] args) {// 일반스레드 (작업이 종료되어야 종료)
		Thread time = new Thread(new Timerb()  ); 
		time.setDaemon(true); // 데몬스레드 - 일반스레드가 [모두] 종료되어야 작업이 완료가 안되도 종료됨
		time.start();
		String answer = JOptionPane.showInputDialog("사과 알파벳을 입력하세요");
				
		if(answer.trim().toLowerCase().equals("apple")) {// trim 공백빼고, toLowerCase소문자
			System.out.println("정답입니다");		
		}
		else { System.out.println("정답이 아닙니다"); }
	}//end main

}
