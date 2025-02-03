package com.company.day013;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collcection006 {
	public static void main(String[] args) {
		Set <Score> scores = new HashSet<>();
		scores.add(new  Score("아이언맨",30,40,50)); 
		scores.add(new  Score("아이언맨",30,40,50)); 
		scores.add(new  Score("아이언맨",30,40,50)); 
		scores.add(new Score("헐크"   ,40,60,70)); 
		scores.add(new  Score("캡틴",80,90,100));
		
		System.out.println(scores.size() + "명");
		
		Iterator<Score> iter = scores.iterator(); //1. 줄서기
		while(iter.hasNext()) { //2. 처리대상확인
			Score s= iter.next(); //3. 꺼내오기			
			System.out.println(s.getName() +"\t 총점 : " + (s.getKor() + s.getEng() + s.getMat())
					+ "\t 평균 :" + s.getAver());			
		}
	}
}
/*Q1. HashSet 만들기
Q2. 아래데이터 넣기
scores.add(new  Score("아이언맨",30,40,50)); 
scores.add(new  Score("아이언맨",30,40,50)); 
scores.add(new  Score("아이언맨",30,40,50)); 
scores.add(new Score("헐크"   ,40,60,70)); 
scores.add(new  Score("캡틴",80,90,100));
> 갯수는 3개로 나오게 만들기
Q3. Iterator로 출력하기 - 사용자정보,총점, 평균*/