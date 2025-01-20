package com.company.day008;

/* 			  Object 		
	 ↑          			↑
	Grand(one,two)     		Aunt(name="MiMi", to String)
	↑        ↑
Father      Uncle     
(three)      (four / one, two)
*/
class Grand extends Object{
	public void one() {System.out.println("Grand : one");}
	public void two() {System.out.println("Grand : two");}
}// end Grand
class Aunt extends Object{
	String name="MiMi";
	@Override public String toString() {  return name + "이모"; }	
}// end Aunt
class Father extends Grand{
	public void three() {System.out.println("Father : three");}
}// end Father
class Uncle extends Grand{
	public void four() {System.out.println("Uncle : four");}
	public void one() {System.out.println("Uncle : one");}
	public void two() {System.out.println("Uncle : two");}
}// end Uncle

public class inheritance004 {
	public static void main(String[] args) {
		Father father = new Father(); father.three(); father.two(); father.one();
		// ↑Object   {#3 }#4  객체를 만들고
		// ↑Grand()  {#2 }#5  one(), two() 사용가능
		// ↑Father() {#1 }#6  three() 사용가능
		Uncle uncle = new Uncle(); uncle.four(); uncle.two(); uncle.one();
		// ↑Object   {#3 }#4   객체를 만들고
		// ↑Grand()  {#2 }#5  		   one(), two() 사용가능 - override : 부모클래스와 같은 메서드 재정의
		// ↑Uncle()  {#1 }#6   four(), one(), two() 사용가능   extends(상속), 부모와 같은 메서드
		//													override 우선순위 : 자식메서드
		Aunt aunt = new Aunt();
		System.out.println(aunt.toString()); System.out.println(aunt);
		

	}

}
