package com.company.selftest;
import java.util.Scanner;
public class Selftest007 {
	public static void main(String[] args) {		
	        Scanner sc = new Scanner(System.in);
	        System.out.print("a, b, c 중에 입력해주세요: ");
	        String fruit = sc.next();
	        switch (fruit) {
	            case "a":
	            case "A":
	                System.out.println("apple");
	                break;
	            case "b":
	            case "B":
	                System.out.println("banana");
	                break;
	            case "c":
	            case "C":
	                System.out.println("coconut");
	                break;
	           
	        }

	      
	}
}
