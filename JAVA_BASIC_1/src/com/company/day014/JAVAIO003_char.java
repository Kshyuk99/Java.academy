package com.company.day014;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;


public class JAVAIO003_char {
	public static void main(String[] args) {
		String folder_rel="src/com/company/day014/";				
		String file_rel="file003.txt";
		
		//1. folder+file 준비
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_rel);
		
		try {
			if(!folder.exists()) {folder.mkdir();}
			if(!file.exists()) {file.createNewFile();}
			System.out.println("폴더/파일");
		} catch(Exception e) {e.printStackTrace();}
		//2. char 쓰기
		//   Reader > [프로그램] > Writer[#]
		try {
			Writer writer = new FileWriter(folder_rel + file_rel, true);
			writer.write("안녕");
			writer.flush();
			writer.close();
			System.out.println("쓰기완료");
		}catch(Exception e) {e.printStackTrace();}
		
		//3. char 읽기
		//  [#]Reader > [프로그램] > Writer
		try {
			Reader reader = new FileReader(file);
			//System.out.println((char)reader.read());
			int cnt=0;
			while( (cnt=reader.read())!= -1) {
				System.out.print((char)cnt);
			}
			reader.close();
			System.out.println("\n\n읽기완료");
		}catch(Exception e) {e.printStackTrace();}
		
	}
}
