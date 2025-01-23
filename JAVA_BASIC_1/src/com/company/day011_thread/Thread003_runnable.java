package com.company.day011_thread;
class Animal{}
//class DogShow extends Thread{  //1. Thread-수행클래스상속
class DogShow extends Animal implements Runnable{
	@Override public void run() {//2. 해야할일 -run 
		for(int i=0; i<5; i++) {
			System.out.println("(ΦωΦ)");
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) {  e.printStackTrace(); }
		}
	}
}

public class Thread003_runnable {
	public static void main(String[] args) {
		Thread show = new Thread(new DogShow()); show.start(); //#3. start
		Thread sound = new Thread(new Runnable() {
			@Override public void run() {
				for(int i=0; i<5; i++) {
					System.out.println("멍");
					try { Thread.sleep(1000); } 
					catch (InterruptedException e) {  e.printStackTrace(); }
				}
				
			}
			}); sound.start(); //#3. start
	}// end main
}// end class
