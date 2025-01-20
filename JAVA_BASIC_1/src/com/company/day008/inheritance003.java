package com.company.day008;
//1. 클래스는 부품객체  2.상태와 행위  3. 상속: 재활용, 부모가진기능 나한테맞게 수정(override)
/* Object {} 
	↑
	MobileNote7      iris (private) /   getter/setter
	↑ (extends)
	MobileNote8      face (private) /   getter/setter
	↑ (extends)
	MobileNote9      int battery (private)/ newshow()  getter/setter
*/

class MobileNote7 extends Object {
	private String iris;	// alt+shift+s(getter/setter)
	public String getIris() { return iris; } 
	public void setIris(String iris) { this.iris = iris; }  
	public void newShow() { System.out.println("::: Note7새로운기능 = 홍채인식 \n" + iris); }
}

class MobileNote8 extends MobileNote7 {
	private String face; // alt+shift+s(getter/setter)

	public String getFace() { return face; } 
	public void setFace(String face) { this.face = face; }  
	@Override public void newShow() { super.newShow(); System.out.println("::: Note8새로운기능 = 안면인식 \n" + face);}
}
class MobileNote9 extends MobileNote8{ 
	int battery; // alt+shift+s(superclass)	
	public MobileNote9() { super();  this.battery=24; }
	public int getBattery() { return battery; }
	public void setBattery(int battery) { this.battery = battery; }
	@Override public void newShow() {  super.newShow(); 
	System.out.println("::: Note9새로운기능 = 하루종일 사용하는 배터리 \n" + battery);}
}
//alt+shift+s(override)
public class inheritance003 {
	public static void main(String[] args) {
		MobileNote9 my9 = new MobileNote9();
		my9.setIris("brown");
		my9.setFace("pretty");
		my9.newShow();

	}

}
