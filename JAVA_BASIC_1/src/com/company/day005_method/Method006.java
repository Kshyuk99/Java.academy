package com.company.day005_method;

public class Method006 {
	
	public static  int  return_num() {return 1;}
	public static double  return_float() {return 3.3333;}
	public static String mycolor() {return "purple";}
	public static String jangsu() {return "*****";}
	public static int myadd(int a, int b) {return a+b;}
	public static String myban(char a) {return "나는" +((a=='A')?"노랑조":"주황조");}
	public static String stdId(int a) {return "G" + a;}
	public static char stdAvg(int a) {return (a>=90)? 'A': (a>=80)? 'B': (a>=70)? 'C' : 'D';}
	
	/*
	char result = ' ';
	if(a>=90) {result='A'}
	else if(a>=80) {result = 'B';}
	return result; */
		
	public static void main(String[] args) {
		
		//              public static 리턴값 메서드명(파라미터){}
		// 				public static 1 return_num(){}
		//				public static int return_num(){return 1;}
		System.out.println("1. 내가 좋아하는 숫자 :" + return_num());
		
		//				public static 3.3333 return_float(){return ;}
		//				public static 3.3333 return_float(){return 3.3333;}
		System.out.println("2. 10/3.0을 실수로 표현 :" + return_float());
		
		//				public static purple myColor(){}
		//				public static purple myColor(){return "purple"}
		System.out.println("3. BEST COLOR : " + mycolor());
		
		// 				public static *****jangsu(){}
		//   			public static String jangsu(){return "*****"}
		System.out.println("4. 장수돌침대 별이 : " + jangsu());
		
		
		System.out.println("5. 10+20= " + myadd(10,20));
		
		//				public static 노랑조  myban('A'){}
		//				public static String myban(char a){return a=='A'?"노랑조":"주황조";}
		System.out.println("6. 반(노랑조/주황조)= " + myban('A'));
		
		//				public static G1111  stdId(int a){}
		//				public static String stdId(int a){return "G" + a;}
		System.out.println("7. 당신의 학번은? " +stdId(1111) );	
		
		//				public static B    stdAvg(88   ){90이상 A,,,,}
		//				public static char stdAvg(int a){return (a>=90)? 'A': (a>=80)? 'B': (a>=70)? 'C' : 'D';}
		System.out.println("8. 당신의 평균은? " + stdAvg(88));
		
				
	}
	

}
