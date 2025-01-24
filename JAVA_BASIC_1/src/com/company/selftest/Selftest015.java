package com.company.selftest;

import java.util.Arrays;


public class Selftest015 {
	public static void main(String[] args) {
		int []arr = new int[5];
		int data=1;
		for(int i=0;  i<arr.length; i++) {
			arr[i]=data++;
			System.out.println(arr[i] ); 
		}
	}

}

