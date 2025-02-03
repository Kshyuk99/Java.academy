package com.company.day013;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Collection007_map {
	public static void main(String[] args) {
		// 데이터 입력
		Map<Integer, UserInfo> map = new HashMap<>();  
		// new UserInfo("아이언맨", 50), new UserInfo("헐크", 40),  new UserInfo("캡틴", 120);
		map.put(  1,  new UserInfo("아이언맨"    , 50) );
		map.put(  2,  new UserInfo("헐크"       , 40) );
		map.put(  3,  new UserInfo("캡틴"       , 120) );
		map.put(  1,  new UserInfo("아이언맨-new", 50) );
		
		System.out.println( map );
		System.out.println( map.size() );
		
		//1. 줄서기  2.처리대상확인  3.대상꺼내오기   ( map! key를 줄께 value다오)
		System.out.println(  map.keySet()    );//[1, 2, 3]
		System.out.println(  map.entrySet()  );//[1=UserInfo [name=아이언맨-new, age=50], 2=UserInfo [name=헐크, age=40], 3=UserInfo [name=캡틴, age=120]]

		Iterator <Integer>  iter1 = map.keySet().iterator();    //   →[1, 2, 3]
		while(iter1.hasNext()) {  // [→1, 2, 3]
			Integer key = iter1.next();// 1 [→, 2, 3]
			System.out.println(key + "\t" + map.get(key));  //( map! key를 줄께 value다오)
		}
		
		System.out.println();
		System.out.println();
		
		Iterator <Entry <Integer, UserInfo>> iter2=    map.entrySet().iterator();
		while(iter2.hasNext()) {
			Entry <Integer, UserInfo>  temp =iter2.next();
			System.out.println(temp.getKey() + "\t" + temp.getValue());
		}
		 
	}
}
/***
1. 콜렉션프레임워크- 동적배열
2. 핵심 인터페이스 [List, Set, Map  ]

  List :   기차    인덱스여부 O ,  중복허용여부 O ,  add, get, size, remove, contains
  	   =  ArrayList (검색) , LinkedList(삽입, 삭제) , Vector(쓰레드)
  	    
  Set  :   주머니   인덱스여부 X ,  중복허용여부 X ,  add, 향for/iterator , size, remove, contains
  Map  :   사전     키:값 - 쌍(Entry),            put, get , size, remove, contains
 
**/ 