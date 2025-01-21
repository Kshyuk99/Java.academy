package com.company.day009;

//static은 this 사용불가
class MemberCall001{
	int        instanceValue=10; //인스턴스변수 / heap, new, 생성자, this          
	static int classValue=20;   //클래스      /method, new보다 먼저 메모리에 올라감 ↑
	
	int          instanceValue2 = classValue;  //인스턴스변수 / heap, new, 생성자, this      
	//static  int classValue2 = instanceValue; 
	//  1)라인A   클래스변수, method, new보다 먼저 메모리에 올라감 ↑ , this 사용불가
	
	static void staticMethod1() {
		System.out.println(classValue);
		//System.out.println(instanceValue);  // 2) 라인 B  this
	}
	
	 void instanceMethod1() {
		System.out.println(classValue);
		System.out.println(instanceValue);  // 3) 라인 C 인스턴스메서드  
	}	
	
	static void staticMethod2() {
			System.out.println(classValue);
			//instanceMethod1();  //4)라인D   this 사용불가/ method area / new보다 먼저 메모리 올라감
	}
	 void instanceMethod2() {
		 staticMethod1();  	// 5) 라인 E  
	}	
}

class Car4 extends Object{
	private String color;
	public Car4() { super();  }	
	@Override public String toString() {  return "Car4[color =" + color + "]"; }
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
}

public class Repeat2 {
	public static void main(String[] args) {
		Car4 c1 = new Car4(); c1.setColor("red");
		System.out.println();
			//Q11
	}
}


/*Q7 private -> package -> protected -> public */

/*Q8 getter/setter 
	 toString()	*/

/*Q9 */

/*Q10 클래스를 재사용하고 기본클래스를 물려받아 새로운 부분만 추가하거나 수정하기위해 사용*/

/*Q11 class 자식클래스 extends 부모클래스*/
