package com.company.day013;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Q1.   다음 빈칸을 채우시오
1. 콜렉션프레임워크
- [     ##1. 배열   ]의 단점을 개선한 클래스 [##2. 객체   ]만 저장가능 (동적배열)
- 저장공간의 크기를 [##3. 동적     ]으로 관리함.

2. 핵심 인터페이스 [##4. 3개 List, Set, Map   ]
- 인터페이스를 통해서 틀이 잡혀 있는 방법으로 
  다양한 컬렉션 클래스를 이용함.

  List : (기차)    ##5.     인덱스여부 O ,    중복허용여부 O, add/get/size/remove/contains
  Set  : (주머니)   ##6.     인덱스여부 X ,    중복허용여부 X, add/(향상된for문)iterator/size/remove/contains
  Map  : (사전)    ##7.     키:값 - 쌍(Entry),           put/get/size/remove/contains

Q2. public > protected(extends) > package(default) > private

*/


public class Collection001 {
   public static void main(String[] args) {
	       UserInfo [] arr = new UserInfo[]{ 
	       	new UserInfo("아이언맨",50), 
	       	new UserInfo("헐크",40), 
	       	new UserInfo("캡틴",120) , };       

	       //##1. 데이터 입력   ( add, get, size, remove, contains)
	       List<UserInfo> list = new ArrayList<>();
	       list.add(arr[0]);  list.add(arr[1]);  list.add(arr[2]);
	       /*for(int i=0; i<arr.length; i++) {
	    	   list.add(arr[i]);
	       } */
	        
	       //##2. 데이터 출력
	       System.out.println(list.get(0));
	       //2-1. for + size (get)
	       System.out.println("\n\n= NAME\t AGE=");
	       for(int i=0; i<list.size(); i++) {
	    	   UserInfo temp =list.get(i);
	    	   System.out.println(temp.getName()+ "\t" + temp.getAge());
	       }
	       
	       //2-2. 향상된 for
	       System.out.println("\n\n= NAME\t AGE=");
	       for( UserInfo temp : list) { //list에서 해당하는 자료형
	    	   System.out.println(temp.getName()+ "\t" + temp.getAge());
	       }
	       
	       //2-3. Iterator
	       //1. 리스트모으기(iterator) //2. 처리대상확인(hasNext) //3. 데이터가져오기(next)
	       Iterator <UserInfo> iter = list.iterator(); //1) 줄서기 iter -> ["AAA", "BBB", "CCC"]
	       while(iter.hasNext()) { //2) 처리대상 iter  [-> "AAA", "BBB", "CCC"]
	    	   UserInfo temp = iter.next(); //3) 꺼내오기 "AAA"  iter  [-> "BBB", "CCC"]
	    	   System.out.println(temp.getName()+ "\t" + temp.getAge());
	       }
	   }
	}


