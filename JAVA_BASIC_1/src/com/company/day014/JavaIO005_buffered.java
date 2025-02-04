package com.company.day014;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class JavaIO005_buffered {
	public static void main(String[] args) throws Exception {		
		String folder_rel="src/com/company/day014/";				
		String file_rel="file005.txt";
		String network = "src/com/company/day014/file003.txt";
		
		//1. 폴더+파일 만들기
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_rel);
		
		try {
		if(!folder.exists()) {folder.mkdir();}
		if(!file.exists()) {file.createNewFile();}
		}catch(Exception e) {e.printStackTrace();}
		
		//2. 파일쓰기 (byte)
		//    InputStream > [program] > OutputStream[#]
		// BufferedWriter(속도향상) - OutputStreamWriter(단어) - FileOutputStream(byte)
		// file003.txt 읽어와서 file005.txt에 쓰기
		InputStream is = new FileInputStream(network);		
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( new FileOutputStream(file)))   ;
		int cnt1=0;
		while((cnt1=is.read())!=-1) { bw.write(cnt1); }
		bw.flush(); bw.close();
		
		//3. 파일읽기(byte)
		//	   [#] InputStream > [program] > OutputStream
		// BufferedReader(속도향상) - InputStreamReader(단어) - FileInputStream(byte)		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)) );
		
		String 		 line = "";   //  line="a" (a : 1000번지)  , line=+"b"  (ab : 1001번지)  주소가 바뀜 - 새로
		StringBuffer sb   = new StringBuffer(); // sb.append("a") , sb.append("ab")  (sb : 2000번지) 주소안바뀜
		while((line=br.readLine())!=null) { sb.append(line+"\n"); }
		System.out.println( sb.toString() );
		br.close();
	}
}
/*
1  white  1200 
2  choco  1500 
3  banana 1800 
*/