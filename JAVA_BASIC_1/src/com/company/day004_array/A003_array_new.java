package com.company.day004_array;
import java.util.Arrays;
public class A003_array_new {
	public static void main(String[] args) {
		int [] arr = new int[3];
					//1. new heap 공간빌려오기
					//2. int[3]  int 형태 공간 3개
					//3. 3개 : index 0~2
		//arr[0] = 1;
		//arr[1] = 2;
		//arr[2] = 3;
			int data =1;
		arr[0] = data++;  //1. arr[0] = 1대입    2. data++ 값증가  2
		arr[1] = data++;  //1. arr[1] = 2대입    2. data++ 값증가  3
		arr[2] = data++;  //1. arr[0] = data 대입    2. data++ 값증가
		
		System.out.println(arr[0] + "\t");
		System.out.println(arr[1] + "\t");
		System.out.println(arr[2] + "\t");
		
		System.out.println();
		for(int i=0; i<arr.length; i++){System.out.println(arr[i] + "\t");}
	}

}
