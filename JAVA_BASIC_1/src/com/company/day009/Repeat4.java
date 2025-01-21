package com.company.day009;

//Q14. 오버라이드 - 상속시(extends) 부모메서드와 같은 메서드/ 자식클래스에 맞게 수정

class Parent extends Object {
    int i, j;
    public Parent(){   super();     }  //// 1) 누구 호출한것이지 적어주세요! Object  =>  
    public Parent(int i, int j) {  
        super();  //// 2) 누구 호출한것이지 적어주세요!  =>   Object()
        this.i=i;
        this.j=j;
    }
}
class Child extends Parent {
    int k;
    public Child(){  super();  }  //// 3) 누구 호출한것이지 적어주세요! => Parent()  
    public Child(int i,int j,int k){ 
        super(i,j); //// 4) 누구 호출한것이지 적어주세요! => Parent(int i, int j) 
        this.k=k;
    }
}
public class Repeat4 {
	public static void main(String[] args) {
        Child child=new Child(10,20,30); 
    
        System.out.println(child.i);  //5) 결과 출력  10 i=parent
        System.out.println(child.j);  //5) 결과 출력  20 j=parent
        System.out.println(child.k);  //5) 결과 출력  30 k=parent
        
       
	}
}
/*
Object			Object()			 {#3              }#4
↑
Parent {i, j}	Parent(int i, int j) {#2    i=10, j=20}#5  생성자() 인스턴스변수를 초기화해 사용가능
↑
Child {k}		new Child(10,20,30)  {#1          k=30}#6
*/