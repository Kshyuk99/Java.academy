package com.company.day015;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Revice_IO {
	public static void main(String[] args) {
		String folder_rel="src/com/company/day015/";  //패키지변경
		String file_rel="review.txt";
		
		//1. 폴더+파일 만들기
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_rel);
		
		try {
		if(!folder.exists()) {folder.mkdir();}
		if(!file.exists()) { file.createNewFile();}
		System.out.println("폴더/파일");
		} catch (Exception e) {  e.printStackTrace(); }
		
		//2. 파일쓰기(byte)
		// InputStream >  [프로그램]  > OutputStream#
		// BufferedWriter(속도향상) - OutputStream(char) - FileOutputStream(byte)
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
			bw.write("apple\n"); bw.write("banana\n"); bw.write("coconut\n"); 
			bw.flush(); bw.close();
			System.out.println("작성완료");
		} catch (Exception e) {  e.printStackTrace(); } //여기까지 9번시험문제
		
		
		//3. 파일읽기(byte)
		// InputStream# >  [프로그램]  > OutputStream
		// BufferedReader(속도향상) - InputStreamReader(char) - FileInputStream(byte)
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String line=""; StringBuffer sb = new StringBuffer();
			while((line=br.readLine())!=null) {sb.append(line+"\n");}
			System.out.println(sb.toString());
			br.close();
		} catch (Exception e) {  e.printStackTrace(); }
		
	}
}
