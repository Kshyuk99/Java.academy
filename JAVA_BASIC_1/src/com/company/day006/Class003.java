package com.company.day006;
import java.util.Scanner;
class student2{
	
	String name;
	int no;
	int kor;
	int eng;
	int math;

	void info() {		
		System.out.println("이름 : " + name); 
		System.out.println("총점 : " + (kor+eng+math));  
		System.out.println("평균 : " + (kor+eng+math)/3f); 
	}
}

public class Class003 {
	public static void main(String[] args) {
		student2 s2 = new student2();
		// 1. 1000번지 new (heap)   
		// 2. student2() 초기화-쓸수있게 청소
		// 3. s2 = 1000번지 
		s2.name = "first"; s2.no = 11;
		s2.kor =100; s2.eng =100; s2.math=99;
		s2.info();
	}

}
/* 3. student2 s2 = new student2();  
--------------------------------
[method : 정보, static, final] student2, Class003
--------------------------------
[heap : 동적]    						|[stack: 잠깐빌리기]
									s2.info()  [1000번지에 가서 info()하세요]
[1000번지]student2
(name="first", no=11, kor=100,eng=100,math=99)   <-s2 [1000번] 24,25번째줄
[1000번지]student2
(name=null, no=0, kor=eng=math=0)   <-s2 [1000번]   19번째줄
               						| main
---------------------------------
*/