package com.company.day014;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class JavaIO004_img {
	public static void main(String[] args) throws Exception {
		String origin="src/com/company/day014/img.png";
		String target1="src/com/company/day014/img1.png";
		String target2="src/com/company/day014/img2.png";
		
		// 이미지파일 읽어들여서 쓰기
		//1. byte  img.png → img1.png
		//       InputStream(읽기) > [Program] > OutputStream(쓰기)
		InputStream bis = new FileInputStream(origin);
		OutputStream bos = new FileOutputStream(target1);
		
		int cnt1=0;
		while((cnt1=bis.read())!=-1) { bos.write((byte)cnt1); }
		bos.flush();  bos.close();  bis.close();
		System.out.println(">> 이미지 복사완료");
		
		//2. char  img.png → img2.png
		//      Reader (읽기) > [Program] > Writer(쓰기)
		Reader cr = new FileReader(origin);
		Writer cw = new FileWriter(target2);
		
		int cnt2=0;
		while((cnt2=cr.read())!=-1) { cw.write((char)cnt2); }
		cw.flush();  cw.close();  cr.close();
		System.out.println(">> 이미지 복사완료2");
	}
}
