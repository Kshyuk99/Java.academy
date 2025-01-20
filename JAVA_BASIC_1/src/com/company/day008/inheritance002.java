package com.company.day008;

/* Object 													Object() {#3   }#4
	↑
	Color     name(private)		getter/setter				Color(){  #2     }#5
	↑
	Green     num(private)/ getter/setter ,show(이름,갯수 출력)	Green(){  #1     }#6

*/
class Color{private String name;
public String getName() { return name; }
public void setName(String name) { this.name = name; }
}
class Green extends Color{ private int num;
public int getNum() { return num; } 
public void setNum(int num) { this.num = num; }
public void show() {System.out.println(getName() + "/" + num);}
}

public class inheritance002 {
	public static void main(String[] args) {
		Green mygreen = new Green();  //#
		mygreen.setName ("LIGHT_GREEN");
		mygreen.setNum(5);
		mygreen.show();

	}

}
