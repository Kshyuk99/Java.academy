package com.company.day004_array;

public class A001_repeat_003 {
	public static void main(String[] args) {
		int cnt=0;
		for(int i=1; i<=10; i++) {
			if(i%3==0) {
				cnt++;
			}			
		}
		System.out.println("1~10까지 3의 배수 : "+cnt);
		
		int i=1;
		cnt=0;
		while(i<=10) {
			if(i%3==0) {
				cnt++;
			}
			i++;
		}
		System.out.println("1~10까지 3의 배수 : "+cnt);
		
		cnt =0;
		i=1;     do {if(i%3==0) {cnt++;} i++;}while(i<=10);
		System.out.println("1~10까지 3의 배수 : "+cnt);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
