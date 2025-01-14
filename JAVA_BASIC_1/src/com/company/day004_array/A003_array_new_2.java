package com.company.day004_array;
import java.util.Arrays;
public class A003_array_new_2 {
	public static void main(String[] args) {
		float[] arr = new float[5]; // 1. new  - heap 공간빌려오기
		  	                  // 2. float 자료형 1.1 1.2
		  							  // 3. [5]게      :0~4
 	       float data=1.1f;
 	       //ver-1
	      /*
 	      arr[0] = data; data+=0.1f;   //1. 0번째 공간에 1.1 넣기  2. data의 1.1에 0.1 더하기
	      arr[1] = data; data+=0.1f;   //   1번째 공간에 1.2 넣기     daata의 1.3 (0.1증가)
	      arr[2] = data; data+=0.1f;
	      arr[3] = data; data+=0.1f;
	      arr[4] = data; data+=0.1f; */
 	       
 	      for(int i=0; i<arr.length; i++) {
 				arr[i] = data; data+=0.1f;
 							
 			}
 			
	      /*
	      System.out.printf("%.1f " , arr1[0]);
	      System.out.printf("%.1f " , arr1[1]);
	      System.out.printf("%.1f " , arr1[2]);
	      System.out.printf("%.1f " , arr1[3]);
	      System.out.printf("%.1f " , arr1[4]); */
 			
 		  for(int i=0; i<arr.length; i++) {System.out.printf("%.1f " , arr[i]);}
	      	
		
		
		
		
	}

}
