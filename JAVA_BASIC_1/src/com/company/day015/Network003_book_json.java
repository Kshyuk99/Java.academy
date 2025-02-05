package com.company.day015;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Network003_book_json {
	public static void main(String[] args) {
		String bookurl;
		try {
			bookurl = "https://openapi.naver.com/v1/search/book.json?query="
							 + URLEncoder.encode("ai","UTF-8");
		
		URL url = new URL(bookurl);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		conn.setRequestMethod("GET");
		conn.setRequestProperty("X-Naver-Client-Id", "6tCcjbypFDag_CmqRMQr");
		conn.setRequestProperty("X-Naver-Client-Secret", "9KifHGsyCl");
		
		
		BufferedReader br;
		if(conn.getResponseCode()==200) {br = new BufferedReader(new InputStreamReader(conn.getInputStream()));}
		else {br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));}
		
		String line ="";  StringBuffer sb = new StringBuffer();
		while((line=br.readLine())!=null) {sb.append(line +"\n");}
		System.out.println(sb.toString());
		br.close(); conn.disconnect();
		
		// 필요한 데이터처리
		String result = sb.toString();
		JsonParser parser = new JsonParser();
		JsonObject book = (JsonObject) parser.parse(result);
		JsonArray arr = (JsonArray) book.get("items");
		
		//System.out.println( arr.get(0) );
		for(int i=0; i<arr.size(); i++){
			JsonObject data = (JsonObject) arr.get(i);
			String title = data.get("title").getAsString();
			String description = data.get("description").getAsString();
			System.out.println("TITLE : " + title);
			System.out.println("Description : " + description);
		  }		
		
		} catch (Exception e) {  e.printStackTrace(); }		
	}
}
// > X-Naver-Client-Id: {애플리케이션 등록 시 발급받은 클라이언트 아이디 값}
// > X-Naver-Client-Secret: {애플리케이션 등록 시 발급받은 클라이언트 시크릿 값}
/*
Client ID: 6tCcjbypFDag_CmqRMQr
Client PW:  9KifHGsyCl
 */