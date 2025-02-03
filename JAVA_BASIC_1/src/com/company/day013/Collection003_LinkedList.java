package com.company.day013;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection003_LinkedList {
	public static void main(String[] args) {
		//LinkedList(데이터 + 주소, 객체삭제시 앞뒤 링크만 변경 - 삽입, 삭제),
		//ArrayList(객체삭제시 인덱스가 1개씩 앞으로 당겨짐 - 검색)
		List<String> array = new ArrayList<>();
		List<String> linked = new LinkedList<>(); // 삽입, 삭제
		
		long start, end;
		
		start = System.nanoTime();
		for(int i=0; i<10000; i++) {array.add(0, String.valueOf(i));}		
		end = System.nanoTime();
		System.out.println("ArrayList : " + (end-start) + "ns");
		
		start = System.nanoTime();
		for(int i=0; i<10000; i++) {linked.add(0, String.valueOf(i));}		
		end = System.nanoTime();
		System.out.println("LinkedList : " + (end-start) + "ns");
		
	}
}

// List : (기차) 순서O, 중복허용O, add/get/size/remove/contains  
// List - ArrayList / Vector / LinkedList