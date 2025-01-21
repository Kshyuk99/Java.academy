package com.company.day009;
/*
	Object				 
  	  ↑					   
	Shape002{showArea(int w, int h); showArea(int r);}    
  ↑        ↑       ↑
Rectangle  Circle  Triangle
*/
abstract class Shape002{ abstract void showArea(int w, int h); abstract void showArea(int r); }
class Rectangle extends Shape002{
	@Override void showArea(int w, int h) { System.out.println("사각형의 넓이: " + w*h); }
	@Override void showArea(int r) {  } // 불필요한 override
	
}
class Circle extends Shape002{
 @Override void showArea(int w, int h) {   } // 불필요한 override
 @Override void showArea(int r) { System.out.println("원의 넓이: " + r*r*Math.PI);  } 
}
class Triangle extends Shape002{
	@Override void showArea(int w, int h) { System.out.println("삼각형의 넓이: " + w*h*0.5);  }
    @Override void showArea(int r) {   } // 불필요한 override
	
}

public class Abstract002 {
	public static void main(String[] args) {
		Shape002 area = new Rectangle(); // 부모 = 자식 / 업캐스팅 / 타입캐스팅X
		area.showArea(10, 3); // @Override  구현이 되어 있는 Rectangle의 showArea
		
		area = new Circle();
		area.showArea(10);// @Override  구현이 되어 있는 Circle의 showArea
		
		area = new Triangle();
		area.showArea(10, 3); // @Override  구현이 되어 있는 Triangle의 showArea
		
		

	}

}
