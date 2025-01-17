package com.company.day007;

import java.util.Arrays;

class Score{
	private String name;
	private int kor,eng,math;
	private double avg;
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getKor() {return kor;}
	public void setKor(int kor) {this.kor = kor;}
	public int getEng() {return eng;}
	public void setEng(int eng) {this.eng = eng;}
	public int getMath() {return math;}
	public void setMath(int math) {this.math = math;}
	public double getAvg() {return avg;}
	public void setAvg(int avg) {this.avg = avg;}
	@Override
	public String toString() {		
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + "]";}
	public Score() {
		super();
		
	}
	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = (kor+eng+math)/3f;
		
	}
	
	
	
}

public class Class015_ex {
	public static void main(String[] args) {
		
		//Score one = new Score(); 1) 공간빌리기, 객체생성 2) Score() 초기화사용가능
		
		Score[]arr = new Score[3];
		System.out.println(Arrays.toString(arr) );
		arr[0]= new Score("아이언맨",  100, 100  ,100);
		arr[1]= new Score("헐크",  90, 60  ,80);
		arr[2]= new Score("블랙펜서",  20, 60  ,90);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}

}
