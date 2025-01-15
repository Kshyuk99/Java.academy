package com.company.day005_method;

public class Method003 {
	//1. public static 리턴값 메서드명(파라미터)
	public static void  myInt(int a){ System.out.println("처리할값은 "+a+"입니다.");}
	public static  void goFloat(float a){ System.out.println(a);}  
	public static void  plus(int a, int b){ System.out.println(a+b); }
	//0. jvm 로딩 - 시작점
	public static void main(String[] args) {
		myInt(1);  // 처리할값은 1입니다.  2. 사용부분
		myInt(3);  // 처리할값은 3입니다.
		myInt(4);  // public static 리턴값 메서드명(파라미터)
				   // public static void  myInt(int a){ 처리해야되는 내용}
		
		goFloat(1.1f); //1.1  public static 리턴값 메서드명(파라미터)
		goFloat(10);   //10   public static  void goFloat(float a){ 처리내용}  
		goFloat('a');  //97   아스키코드    실수는 정수를 담을수 있다. 
					   // 정수형 byte, char/short , int, long   < 실수형 float, double
		
		plus(1,2);     //3   public static 리턴값 메서드명(파라미터1, 파라미터2)
		plus(10,3);    //13  public static void  plus(int a, int b){ 두수합 }
	}  // Method004 문제풀기
}
