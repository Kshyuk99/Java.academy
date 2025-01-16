package com.company.day006;
import java.util.Arrays;
import java.util.Scanner;
public class A001_plus_2 {
	public static void main(String[] args) {
		int [][]datas= {{10,10,10,10}, {20,20,20,20}, {30,30,30,30},{40,40,40,40}};
		int [][]result = new int[datas.length+1][datas[0].length+1];
		
		int sum=0; int num=0;
		for(int i=0; i<datas.length; i++) {
			for(int j=0; j<datas[i].length; j++) {
				result[i][j] = datas[i][j];
				sum += datas[i][j];
				result[i][j+1] += sum;
				
			}
		}
		for(int i=0; i<datas.length; i++) {
			for(int j=0; j<datas[i].length; j++) {
				System.out.print(result[i][j]+ "\t");
			}
			System.out.println();
		}
		
	}

}

