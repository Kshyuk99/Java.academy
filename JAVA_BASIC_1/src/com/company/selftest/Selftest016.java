package com.company.selftest;

import java.util.Scanner;

public class Selftest016 {
	public static void main(String[] args) {        
		int[][] arr = new int[2][3];        
        int num=100;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (i+1)*num+j;
            }            
            
        }       
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
}
}