package com.company.day012_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Stream002 {
	public static void main(String[] args) {
		/* 목적 : 데이터종류에 상관없이 같은방식으로 처리
		 	   Arrays.stream(배열)
		 	   Stream.of('값')		 
		 */
		Integer [] arr = {1,2,3,4,5,1,2,1,2};   //배열
		List<Integer> list = Arrays.asList(arr);  //리스트
		
		//#0 Stream <Integer>
		Arrays.stream(arr);    //Stream <Integer>		
		list.stream();		  //Stream <Integer>	
		//#1 중간연산
		//filter
		//distinct (중복생략) / sorted(정렬) / 2개skip 
		// Consumer - 받는용도  void accept(T t)
		list.stream().filter( (t)->{return t%2!=0; })//13511
					 .distinct()//135 중복제거
					 .sorted() //135 정렬
					 .skip(1)  //35   1개 skip
		
					  .forEach(System.out::print);  //#2. 최종연산
		System.out.println();
		System.out.println();
		//#3. 
		Arrays.stream(arr).filter( (t)->{return t%2!=0; })//13511
		 			.distinct()//135 중복제거
		 			.sorted() //135 정렬
		 			.skip(1)  //35   1개 skip

		 			.forEach(System.out::print);
		
		
		/*System.out.println(
			list.stream().filter( (t)->{return t%2!=0; })
		); */
		//Predicate p;
		//boolean java.util.function.Predicate.test ( T t )
	}

}
