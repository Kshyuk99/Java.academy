package com.company.day010_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List001 {
	public static void main(String[] args) {
		String []arr = new String[3];  // 공간 3개안됨, 고정
		System.out.println(Arrays.toString(arr));  //[null, null, null]
		//    부모 =      자식    /업캐스팅
		List list = new ArrayList();  // Ctrl+shift+o
		list.add("one");
		list.add(1);
		list.add(3.14);
		System.out.println(list);  //[one, 1, 3.14]
		
		List<String> list2 = new ArrayList();
		list2.add("two");
		//list2.add(2);
		System.out.println(list2);
		
		//Q1.  List 이용해 "one", "Two", "Three" add이용해 넣기
		
		List<String> list3 = new ArrayList();
		list3.add("One");
		list3.add("Two");
		list3.add("Three");
		System.out.println(list3);
		System.out.println("갯수 > " + list3.size());
		System.out.println("꺼내오기 > " + list3.get(1));
		System.out.println("포함 > " + list3.contains("Two"));
		System.out.println("삭제 > " + list3.remove(1));
	}

}
/*
List (기차) - 순서 O / 중복허용 O , add/get/size/remove/contains 
 
 

 */