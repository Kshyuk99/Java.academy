package com.company.day004_array;

public class A001_repeat {
	public static void main(String[] args) {
		//1. for 1  2  3  {}  {i}
		for(int i=1; i<=3; i++){System.out.print(i+"\t");}
		
		//2. while  1  2  3
		int i=1;
		while( i<=3 ){System.out.print(i+"\t"); i++;}
		
		//3. do while  1  2  3 - 무조건 1번은 실행
		i=1;
		do{System.out.print(i+"\t"); i++;}while( i<=3 );
	}

}
