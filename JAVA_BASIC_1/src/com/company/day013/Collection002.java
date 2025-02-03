package com.company.day013;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Collection002 {
	public static void main(String[] args) {
		List<Score> list = new ArrayList<>();	
			list.add(new Score("아이언맨",30,40,50));
			list.add(new Score("헐크",40,60,70));
			list.add(new Score("캡틴",80,90,100));
	
	System.out.println(list.size());
	
	for(int i=0; i<list.size(); i++) {
		Score t = list.get(i);
		System.out.println(t.getName() + "\t총점:" +t.getKor()+ "\t" + t.getEng()+ "\t" 
		+t.getMat()+"\t평균:" + t.getAver());
	}
	for(Score t: list ) {
		System.out.println(t.getName() + "\t총점:" +t.getKor()+ "\t" + t.getEng()+ "\t" 
				+t.getMat()+"\t평균:" + t.getAver());
	}
	Iterator<Score> iter = list.iterator();
	while(iter.hasNext()) {
		Score t = iter.next();
		System.out.println(t.getName() + "\t총점:" +t.getKor()+ "\t" + t.getEng()+ "\t" 
				+t.getMat()+"\t평균:" + t.getAver());
	}
	//Q4.
	Scanner sc = new Scanner(System.in);
	System.out.println("총점과 평균을 확인할 이름입력 > ");
	String name = sc.next();
	iter = list.iterator();
	while(iter.hasNext()) {  //iter의 처리대상있는지 확인
		Score t = iter.next(); //3. 꺼내오기
		if(t.getName().equals(name)) {
			System.out.println(t.getName() + "\t총점:" + (t.getKor()+t.getEng()+t.getMat())
					+"\t평균:" + t.getAver() + "\t");
			break;
		}
	}
			 
  }
}

// ArrayList와 LinkList의 차이점 / Vector 차이점
/*
ArrayList: 동적배열기반
LinkedList: 이중연결리스트 기법
Vector: 동적배열기반, 크기확장방식이 ArrayList와 다름
 
 
*/
/*
Q1. 외부에서 (다른폴더에서 사용가능하게)
	/ 생성자, toString, getter+setter 
public class Score{
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int aver;
}

Q2. ArrayList 만들어서 데이터넣기
new ScoreDto8("아이언맨",30,40,50);
new ScoreDto8("헐크",40,60,70);
new ScoreDto8("캡틴",80,90,100);

Q3. 출력 for + size / 향상된 for / Iterator

Q4. 사용자에게 입력받기 -> 그 사용자의 총점과 평균 출력

사용자 총점/평균확인 > 입력받기  (예 : 아이언맨)
아이언맨  총점:120 /평균:40

*/