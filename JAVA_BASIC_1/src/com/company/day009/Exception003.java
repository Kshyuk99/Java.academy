package com.company.day009;
import java.util.Scanner;
public class Exception003 {
	public static int nextInt() throws Exception{ // 에러처리 Exception
		Scanner sc = new Scanner(System.in);
		System.out.println("1을입력");
		return sc.nextInt();  //#### 에러나면
	}
	public static void main(String[] args) {
		int a =-1;
		//while(true) {
		for(;;) {
			try {
			// int  nextInt()
			a= nextInt(); //##### 컨트롤타워에서 처리
			if(a==1) {break;}
			}catch(Exception e) {System.out.println("숫자만 입력");}
		}
		System.out.println("결과물 : " + a);
	}

}
