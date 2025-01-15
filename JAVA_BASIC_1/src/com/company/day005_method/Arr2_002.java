package com.company.day005_method;

public class Arr2_002 {
	public static void main(String[] args) {
		int [][]arr = new int[2][3];
		
		int data=1;
		/*
		arr[0][0] = data++;  //0층0호실에 data 1넣고 1개증가 (2)
		arr[0][1] = data++;  //0층1호실에 data 2넣고 1개증가 (3)
		arr[0][2] = data++;  //0층2호실에 data 3넣고 1개증가 (4)
		
		arr[1][0] = data++;  //0층0호실에 data 1넣고 1개증가 (2)
		arr[1][1] = data++;  //0층1호실에 data 2넣고 1개증가 (3)
		arr[1][2] = data++;  //0층2호실에 data 3넣고 1개증가 (4)
		*/
		
		/*for(int j=0; j<arr[0].length; j++) {arr[0][j] = data++;}
		for(int j=0; j<arr[1].length; j++) {arr[1][j] = data++;}*/
		
		for(int i=0; i<arr.length; i++)
		{for(int j=0; j<arr[i].length; j++) {arr[i][j] = data++;}}
		
		/*for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}*/
	}

}
