package com.company.day010_collection;

import java.util.HashMap;
import java.util.Map;

// List : 기차  -  순서O, 중복O / add, get, size, remove, contains
// Set  : 주머니 -  순서X, 중복X/  add, get(X), size, remove, contains
// Map  : 사전  -  [key:value] 한쌍 - entry / put, get, size, remove, contains 


public class Map001 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("one", "하나");
		map.put("two", "둘");
		//map.put("one", "셋"); // key값이 같으면 덮어씀
		map.put("three", "셋");
		
		System.out.println(map);
		System.out.println(map.get("one")); 
		System.out.println(map.size());
		System.out.println(map.remove("three"));
		System.out.println(map.containsKey("one"));
		
		System.out.println();
		System.out.println();
		for(String key : map.keySet()) {
			System.out.println(key + "/" + map.get(key));
		}
		
	}

}
