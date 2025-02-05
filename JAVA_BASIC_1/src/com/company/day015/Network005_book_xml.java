package com.company.day015;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Network005_book_xml {
	public static void main(String[] args) {
		try {
//	         String book_url = "https://openapi.naver.com/v1/search/book.xml?query="
//	                  +URLEncoder.encode("ai","UTF-8") + "&sort=sim";
	         // 1
	         String book_url = "https://www.weather.go.kr/w/rss/dfs/hr1-forecast.do?zone=1168064000";
	         URL url = new URL(book_url);
	      
	         // 2
	         HttpURLConnection conn = (HttpURLConnection) url.openConnection();

	         // 3
	         conn.setRequestMethod("GET");
//	         conn.setRequestProperty("X-Naver-Client-Id", "NvmeYvs8dwYiKjj3KI4p");
//	         conn.setRequestProperty("X-Naver-Client-Secret", "NEUEosAj7R");
	         
	         int resp = conn.getResponseCode();
	         System.out.println(resp);
	         
	         // 4
	         BufferedReader br;
	         if (resp == 200) {
	            br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	         } else {
	            br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
	         }
	         
	         // 5
	         String line ="";   StringBuffer sb = new StringBuffer();
	         while((line=br.readLine()) != null) {
	            sb.append(line+"\n");
	         }
	         br.close();      conn.disconnect();
	         
	         // System.out.println(sb.toString());
	         
	         // 5-2 xml
	         
	         Path path = Paths.get("src/com/company/day015/network001.xml");
	         String result = sb.toString();
	         BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
	         
	         bw.write(result);
	         bw.close();   System.out.println("xml 저장 성공");
	         
	         File file = new File("src/com/company/day015/network001.xml");
	         //6. 필요한 데이터 처리      xml
	         // 싱글톤(static 메서드로 객체 생성 - 전역변수 - 데이티 공유 가능) + 팩토리 패턴
	         DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
	         DocumentBuilder builder = factory.newDocumentBuilder();
	         Document doc = builder.parse(file);
	         NodeList items = doc.getElementsByTagName("data");
	       for(int i=0; i<items.getLength(); i++) {  // NodeList ( 라이브컬렉션 - DOM의 변경사항을 실시간 반영 / 텍스트, 속성 )
	         Node item = items.item(i);      //data 1개
	         //System.out.println(item);      // <item></item>
	         
	         NodeList child = item.getChildNodes();   // 공백 => <title></title> => 공백 => <link></link> => ...
	         //System.out.println(child.getLength());    //13
	         for(int j=0; j<child.getLength(); j++) {
	        	 Node data = child.item(j);
	        	 if(data.getNodeType() == Node.ELEMENT_NODE) {
	        		 String name = data.getNodeName();
	        		 String value = data.getTextContent();
	        		 if(name.equals("hour")) {System.out.println("HOUR : " + value); }
	        		 else if(name.equals("temp")) {System.out.println("TEMP : " + value);}
	        		 System.out.println("--------------------------");
	        	 }
	         }
	       }
	         
	      } catch (Exception e) { e.printStackTrace(); }
	}
}
// > X-Naver-Client-Id: {애플리케이션 등록 시 발급받은 클라이언트 아이디 값}
// > X-Naver-Client-Secret: {애플리케이션 등록 시 발급받은 클라이언트 시크릿 값}
/*
Client ID: 6tCcjbypFDag_CmqRMQr
Client PW:  9KifHGsyCl
 */