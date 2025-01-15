package com.company.day005_method;

public class Method005 {
	public static String sign(){ return "sally"; }
	
	public static  int   plus( int a , int b ){  return a+b; }
	////
	public static void main(String[] args) {
	   System.out.println(  "당신의 이름은? " + sign());  
	   //                      public static  리턴값 메서드명(파라미터)
	   //            결과 :   당신의 이름은?     sally
	   //                      public static String sign(){ return "sally"; }
	   
	   int a = 10, b=3;
	   int             result = plus(a,b); 
	   // public static  리턴값 메서드명(파라미터) 
	   // public static  int   plus( int a , int b ){  return a+b; }
	   System.out.println(result);  //13
	}
}
