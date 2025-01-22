package com.company.day010_collection;

import java.util.HashSet;
import java.util.Set;

/*
List: 기차   - 순서O, 중복허용O / add, get, size, remove, contains
Set : 주머니  - 순서X, 중복허용X / add,Iterator, size, remove ,contains 
*/
public class Set001 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("three");
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.remove("one"));
		System.out.println(set.contains("two"));
		System.out.println(set.size());
		
		for(String s : set) {System.out.println(s);} }
}
