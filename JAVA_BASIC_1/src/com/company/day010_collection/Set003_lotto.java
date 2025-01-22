package com.company.day010_collection;

import java.util.HashSet;
import java.util.Set;

public class Set003_lotto {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		while(set.size() < 6) {
			// 				0~0.999   *45  =  0~44
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);
	}

}
// List : 기차 ,  순서O, 중복O - add, get, size, remove, contains
// Set  : 주머니 ,  순서X, 중복X - add, get(X), size, remove, contains