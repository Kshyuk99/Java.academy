package com.company.day005_method;

public class Arr2_001 {
	public static void main(String[] args) {
		//Step1. 1차원배열
		
		
		int []arr1 = new int[3];  // 1. new 공간빌리기(heap)  2. int(정수, 1,2,3)  3. [3] 공간3개
		// 4.arr1(주소보관 : stack)
		// 의미 : 3 (0~2)
		
		//Step2. 2차원배열
		int [][] arr2 = new int[2][3]; //1. new 공간빌려오기(heap)  2. int(정수)  3. [2]층[3]칸 = 6칸
		//4. arr2(주소보관 : stack)
		// 의미 : 2층(0,1) 3칸(0,1,2)
		//       00 01 02
		//       10 11 12
		
		int [][] arr3 = new int[3][4];  //1. new 공간빌려오기 2. int  3. [3]층[4]칸 = 12
		//  3층(0,1,2) 4칸-호실(0,1,2,3)
		//  0층  00  01  02  03
		//  1층  10  11  12  13
		//  2층  20  21  22  23
		
		int [][] arr4 = new int[2][2]; //[2]층[2]칸
		//0 층    00호실  01호실
		//1층     10호실  11호실
		arr4[0][0] = 1;    arr4[0][1] = 2;
		arr4[1][0] = 3;    arr4[1][1] = 4;
		
		System.out.println(arr4[0][0]); System.out.println(arr4[0][1]);  System.out.println();
		System.out.println(arr4[1][0]); System.out.println(arr4[1][1]);  System.out.println();
		
		for(int i=0; i<2; i++) {System.out.print(arr4[0][i]);} System.out.println();
		for(int i=0; i<2; i++) {System.out.print(arr4[1][i]);} System.out.println();
		
		for(int j=0; j<2; j++) {
		for(int i=0; i<2; i++) {
			System.out.print(arr4[j][i]);
			} 
		System.out.println();
		}
		System.out.println("층의 개수 : " + arr4.length);
		System.out.println("0층 칸의 개수 : " + arr4[0].length);
		//4단계 for+length로 표현
		
	}

}
