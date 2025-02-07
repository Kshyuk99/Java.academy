package com.company.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test009 {
	public static void main(String[] args) {
		String folder_rel = "src/com/company/Test/";
		String file_rel = "test9.txt";
		
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_rel);
		
		try {
			if(!folder.exists()) {folder.mkdir();}
			if(!file.exists()) { file.createNewFile();}			
			} catch (Exception e) {  e.printStackTrace(); }
		
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
			bw.write("ONE\n"); bw.write("TWO\n"); bw.write("THREE");
			bw.flush(); bw.close();
		} catch (Exception e) {  e.printStackTrace(); }
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String line = ""; StringBuffer sb = new StringBuffer();
			while((line=br.readLine())!=null) {sb.append(line+"\n");}
			System.out.println(sb.toString());
			br.close();
			
		} catch (Exception e) {  e.printStackTrace(); }
		
		
	}

}
