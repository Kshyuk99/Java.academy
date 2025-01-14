package com.company.day004_array;
import java.util.Arrays;
public class A003_array_input {
	public static void main(String[] args) {
		int [] arr = {1,2,3};
		
		System.out.println("주소 : " + arr);
		System.out.println("배열안에 들어가 있는 값 :" + Arrays.toString(arr) );
		
		int [] arr2 = new int[3];
						//1. new : heap에 공간빌려오기
						//2. int [3] : int 형태의 공간 3개, 정수형 공간 1,2,3생긴애들
		System.out.println("2-1. 주소 : " + arr2);
		System.out.println("2-2. 배열안에 들어가 있는 값 :" + Arrays.toString(arr) );
		System.out.println("2-3. ");
	}

}
