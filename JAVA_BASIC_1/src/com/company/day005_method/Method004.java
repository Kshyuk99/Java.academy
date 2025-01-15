package com.company.day005_method;

public class Method004 {
	public static  void  test1(int a   ){System.out.println(a);}
	public static  void  test2(double a){System.out.println(a);}
	 public static  void  hap( int a , int b){  //a=3, b=5  3+4+5
		 int box=0;   //box[0]
		 //ver-1
		 //box+=3;   // box[3]   1. 0+3   2. box[3]
		 //box+=4;   // box[7]   1. 3+4   2. box[7]
		 //box+=5;   // box[12]  1. 7+5   2. box[12]
		 //ver-2     for(int i=3; i<=5; i++){ box+=i; }
		 for(int i=a; i<=b; i++){ box+=i; }    System.out.println(box);
	 }
	 public static  void  disp(int a, char b){
		 for(int i=0; i<a; i++) { System.out.print(b); }
	 }
	/////
	public static void main(String[] args) {
					  // public static  리턴값 메서드명(파라미터)
		test1(10);    // public static  void  test1(int a){}
 		test2(1.2);   // public static  void  test2(double a){}
 		hap(3,5);     // public static  void  hap( int a , int b){}
 		disp(7, '*'); // public static  void  disp(int a, char b){}
	}

}
