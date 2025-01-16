package com.company.day006;
/*
@####
#@###
##@##
###@#
####@
*/

import java.util.Arrays;
import java.util.Scanner;
public class A001_plus {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		char [][]arr = new char[5][5];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i==j) {
					arr[i][j]='@';
					}
				else {
					arr[i][j]='#';
				}
				
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}		
				
	}

}
