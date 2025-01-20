package com.company.day008;

class Parent extends Object {
    int i, j;
    public Parent(){   super();     }  //// 1) 누구 호출한것이지 적어주세요! Object  =>  
    public Parent(int i, int j) {  // #4 10, 20
        super();  //// 2) 누구 호출한것이지 적어주세요!  =>  #5 Object()
        this.i=i;
        this.j=j;
    }
}
class Child extends Parent {
    int k;
    public Child(){  super();  }  //// 3) 누구 호출한것이지 적어주세요! => Parent  
    public Child(int i,int j,int k){ //#2 10 , 20 ,30
        super(i,j); //// 4) 누구 호출한것이지 적어주세요! => Parent(int i, int j) #3
        this.k=k;
    }
}
public class Polymorphism006 {
	public static void main(String[] args) {
        Child child=new Child(10,20,30); // #1
     // Child(10,20,30) → Parent(int i, int j){ → Object()
           //		30}				10,20		} ←			} 객체생성
        System.out.println(child.i);  //5) 결과 출력  10 i=parent
        System.out.println(child.j);  //5) 결과 출력  20 j=parent
        System.out.println(child.k);  //5) 결과 출력  30 k=parent
        
        Parent p =child;   //1) 부모,자식확인	=   2)업캐스팅/다운캐스팅   3) 타입캐스팅필요
        System.out.println(p);
	}
}
/*
Object
↑
Parent {i, j}
↑
Child {k}
*/