package com.company.day015;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Network004_json {
	public static void main(String[] args) {
		//1. Gson 생성
		Gson gson = new Gson();
		JsonObject job = new JsonObject();
		job.addProperty("one"  , "일");
		job.addProperty("two"  , "이");
		job.addProperty("three", "삼");
		System.out.println( gson.toJson(job) );
		
		System.out.println(gson.toJson(new GTest(1,"Hello"))  );
		
		//ex) gson 이용해서 json 만들기
		JsonObject a = new JsonObject();
		a.addProperty("name"  , "alpha");
		a.addProperty("age"  , "3");
		a.addProperty("loc", "경기시흥시");
		String result = gson.toJson(a); System.out.println(result);
		
		//3. JsonParser - get
		JsonParser parser = new JsonParser();
		JsonObject a_result = (JsonObject) parser.parse(result);
		String name = a_result.get("name").getAsString();
		String age = a_result.get("age").toString();
		String loc = a_result.get("loc").getAsString();
		
		System.out.println(name + "/" + age + "/" + loc);
	}
}

class GTest{
	private int no;
	private String name;
	public GTest(int no, String name) { super(); this.no = no; this.name = name; }
	
}


//https://mvnrepository.com/artifact/com.google.code.gson/gson/2.2.4