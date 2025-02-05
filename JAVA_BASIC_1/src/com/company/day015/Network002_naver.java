package com.company.day015;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Network002_naver {
	public static void main(String[] args) {
		try {
			//1. URL - https://openapi.naver.com/v1/search/news.xml
			//		   https://openapi.naver.com/v1/search/news.json
			//https://openapi.naver.com/v1/search/book.json
			//2. HttpURLConnection
			String apiurl = "https://openapi.naver.com/v1/search/news.json?query="
							+ URLEncoder.encode("AI", "UTF-8");
			URL url = new URL(apiurl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			//3. 요청설정 - GET/POST		,필수-query(UTF-8) 쿼리스트링
			// > X-Naver-Client-Id: {애플리케이션 등록 시 발급받은 클라이언트 아이디 값}
			// > X-Naver-Client-Secret: {애플리케이션 등록 시 발급받은 클라이언트 시크릿 값}
			conn.setRequestMethod("GET");
			conn.setRequestProperty("X-Naver-Client-Id", "6tCcjbypFDag_CmqRMQr");
			conn.setRequestProperty("X-Naver-Client-Secret", "9KifHGsyCl");
			
			
			//4. 응답확인 - 200
			int code = conn.getResponseCode();  System.out.println(code);
			BufferedReader br;
			if(code == 200) { br = new BufferedReader(new InputStreamReader(conn.getInputStream())); }
			else { br = new BufferedReader(new InputStreamReader(conn.getErrorStream())); }
			
			//5. 응답데이터 - xml/json/csv
			String line="";  StringBuffer sb = new StringBuffer();
			while((line=br.readLine())!=null) {sb.append(line+"\n");}
			System.out.println(sb.toString());
			br.close();  conn.disconnect();
		}catch(Exception e) {e.printStackTrace();}
	}
}
/*
Client ID: 6tCcjbypFDag_CmqRMQr
Client PW:  9KifHGsyCl
 */