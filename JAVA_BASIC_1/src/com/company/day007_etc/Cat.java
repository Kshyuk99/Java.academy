package com.company.day007_etc;

public class Cat { 
	private   int pri; 	   //privtae Cat클래스 내부에서만
			  int pac;    // package(default) - 같은 폴더에서만 Cat클래스가 있는 폴더
	protected int pro; 	  //protected  extends 사용한 곳에서만
	public 	  int  pub;   //public 아무데서나 접근가능, 보안이떨어짐
	
	public int getPri() {return pri;}
	public void setPri(int pri) {this.pri = pri;}
}
