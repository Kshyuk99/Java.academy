package com.company.day014;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class JAVAIO002_byte {
	public static void main(String[] args) {
		String folder_rel="src/com/company/day014/";				
		String file_rel="file002.txt";
		
		//1. folder+file 준비
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_rel);
		
		try {
			if(!folder.exists()) {folder.mkdir();}
			if(!file.exists()) {file.createNewFile();}
			System.out.println("폴더/파일");
		} catch(IOException e) {e.printStackTrace();}
		
		//2. byte 단위로 파일쓰기()
		//    InputStream > [프로그램]  > OutputStream[#]
		try {
			OutputStream output = new FileOutputStream(file);
			output.write('c');
			output.write('o');
			output.write('l');
			output.write('d');
			output.flush();
			output.close();
			System.out.println("OutputStream 쓰기완료");
		} catch(Exception e) {e.printStackTrace();}
		
		
		//3. byte 단위로 파일읽기
		//    InputStream[#] > [프로그램]  > OutputStream
		try {
			InputStream input = new FileInputStream(file);
			//System.out.println(input.read()); //99 'c'
			int cnt=0;
			while((cnt=input.read())!= -1) {
				System.out.print((char)cnt);
			}
			input.close();
		} catch (Exception e) { e.printStackTrace(); }
	}
}
