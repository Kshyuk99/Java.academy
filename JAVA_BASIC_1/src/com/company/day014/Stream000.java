package com.company.day014;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Stream000 {
	public static void main(String[] args) {
		// JAVA IO
		// 입력스트림 / 출력스트림 
		//1. 스트림 : 데이터 종류에 상관없이(STREAM) 같은방식으로 처리(LAMBDA)
		
		Integer [] arr = {1,2,3}; //배열
		List<Integer> list = new ArrayList<>(); // ArrayList
		list.add(1); // int(1) -> Integer (1) wrapper
		list.add(new Integer(2));
		list.add(3);
		
		//Arrays.stream(arr).forEach((t)->{System.out.print(t);});
		//Arrays.stream(arr).forEach(t->System.out.print(t));
		Arrays.stream(arr).forEach(System.out::print);
		
		System.out.println();
		
		list.stream().forEach(System.out::print);
		//Consumer c;
		//void java.util.function.Consumer.accept ( T t )
	}

}
