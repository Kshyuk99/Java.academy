package com.company.day012_lambda;

class  	  Class3{ void method(String str) {System.out.println(str);}  }
interface InterA3{ void inter( Class3 c, String str);     }


public class Lambda003_Ref {
	public static void main(String[] args) {
		//#1. 익명클래스
		InterA3 a1 = new InterA3() {
			@Override public void inter(Class3 c, String str) {	//c안에 method,str(재료, 파라미터)			
				c.method(str);
			}			
		};
		a1.inter(new Class3(), "Hello");
		
		//#2. 람다 ()->{}
		InterA3 a2 =(Class3 c, String str)->{c.method(str);};
		a2.inter(new Class3(), "Hello!");
		
		InterA3 a21 =( c, str) -> c.method(str);//#
		a21.inter(new Class3(), "Hello!!");
		
		//#3. :: 표현식 (참조)
		//InterA3   void inter( Class3 c, String str)
		//			Class3:: method
		InterA3 a3 = Class3::method;
		a3.inter(new Class3(), "Hi");
		
	}//end main
}//end class
