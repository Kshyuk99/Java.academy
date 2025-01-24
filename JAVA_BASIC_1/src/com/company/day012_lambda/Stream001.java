package com.company.day012_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Stream001 {
	public static void main(String[] args) {
		/* 목적 : 데이터종류에 상관없이 같은방식으로 처리
		 	   Arrays.stream(배열)
		 	   Stream.of('값')		 
		 */
		Integer [] arr = {1,2,3,4,5};   //배열
		List<Integer> list = Arrays.asList(arr);  //리스트
		//ver-1   Stream <Integer>
		Arrays.stream(arr).forEach(System.out::print );
		
		System.out.println();   System.out.println();
		
		//ver-2
		//list.stream().forEach((t)->{System.out.println(t);});
		//list.stream().forEach(t->System.out.println(t));
		list.stream().forEach(	   System.out::print);		
		//Consumer <? super Integer> action	
		// Consumer<T>   받는용도 - accept
		// void java.util.function.Consumer.accept ( T t )
	}

}
