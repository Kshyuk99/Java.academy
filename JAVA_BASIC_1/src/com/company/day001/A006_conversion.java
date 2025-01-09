package com.company.day001;
import java.util.Scanner;

public class A006_conversion {
	public static void main(String[] args) {
		// 정수형 : byte(1) short(2) int(4) long(8)
		// 실수형 : float(4) double(5)
		double i = 1.5;
		double dd = 2.7;
		
		System.out.println((int)1.5+(int)2.7);
		
		//Q2. 오류코드
		byte b =1;    //1byte  - 정수형  -1    -128~127
		short s =2;   //2byte  - 정수형
		int i2=4;     //4byte  - 정수형
		long l =8L;   //8byte  - 정수형
		
		boolean bl = true; //1byte  - 논리형 true/false
		
		float f2 = 1.1f;    //4byte
		double d = 1.1;     //8byte
		
		//bl=b;   //2-1. boolean 빼고 형변환 가능
		i2 =b;    //2-2. i2(정수형-4byte-int) = b(정수형-1byte-byte)
		i2 =1;    //2-3. i2(정수형-4byte-int) = 1(정수형-8byte)
		f2  =1;   //2-4. f2(실수형-4byte-float) =1(정수형-8byte) 실수>정수  
				
	}

}
