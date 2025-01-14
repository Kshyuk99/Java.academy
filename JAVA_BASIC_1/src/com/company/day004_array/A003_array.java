package com.company.day004_array;

public class A003_array {
	public static void main(String[] args) {
		// 정수형 배열
		
		int     a = 0;          // 비교  정수형공간  변수명   10
		int []arr = {1,2,3};    //      정수형공간 여러개 []
								//[heap]1000번지 {1,2,3} -> [stack] arr 1000번지
								// 				0  1  2
		
		System.out.println(a);
		System.out.println(arr);
		System.out.println("1꺼내기: " + arr[0]);
		System.out.println("2꺼내기: " + arr[1]);
		System.out.println("3꺼내기: " + arr[2]);
		
		int [] arr3 = {1,2,3,4,5};   // 베열명 arr3 - 1,2,3,4,5(0)
		int [] arr4 = {100,200,300}; //      arr4 - 100,200,300
		char [] arr5 = {'a','b','c'}; //     arr5 - 'a', 'b', 'c'
		
		System.out.println("arr3의 2라는 값 꺼내기: "+arr3[1]);
		System.out.println("arr전체 갯수 : " + arr.length);
		
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		System.out.println(arr3[4]);   // for+length
		
		for(int i=0; i<arr.length; i++) {System.out.println(arr[i]); }
		//           i<5
	}

}
