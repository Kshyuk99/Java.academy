package com.company.selftest;
import java.util.Scanner;
public class Selftest004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);        
        System.out.print("국어 점수를 입력해주세요: ");
        int kor = sc.nextInt();
        System.out.print("영어 점수를 입력해주세요: ");
        int eng = sc.nextInt();        
        String fail = "";
        if (kor < 40) { fail += "국어"; }
        if (eng < 40) {  fail += "영어"; }
        if (!fail.equals("")) {
            System.out.println("과락인 과목: " + fail);
        }         
	}
}
