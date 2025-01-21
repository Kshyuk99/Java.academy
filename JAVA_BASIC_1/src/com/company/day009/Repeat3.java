package com.company.day009;

import java.util.Arrays;

class A{
	private String name;
	
	public A() { super();  }	
	public A(String name) { super(); this.name = name; }
	@Override public String toString() {  return "A[name="+name+"]"; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }


	
}

class TestArr{
	A[]arr = new A[3];
	
	
	
}

public class Repeat3 {
	public static void main(String[] args) {
		A[]arr = new A[3];
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {	arr[i] = new A();	}
		for(int i=0; i<arr.length; i++) {	System.out.println(arr[i]);}
		
		

	}

}
