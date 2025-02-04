package com.company.day014;

import java.io.File;
import java.io.IOException;

public class JavaIO001 {
	public static void main(String[] args) {
		//1. 폴더-파일만들기
		
		//String folder_rel="src/com/company/day014/";
		String folder_rel= "C:\\file\\";
		String file_rel="file001.txt";
		
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_rel);
		
		try {
			if(!folder.exists()) {folder.mkdir();} // 폴더존재하지 않으면 mkdir
			if(!file.exists()) {file.createNewFile();} // 파일만들기
			System.out.println("폴더/파일");
		}catch(IOException e) {e.printStackTrace();}
	}
}
