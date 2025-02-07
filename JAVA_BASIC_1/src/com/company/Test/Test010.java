package com.company.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Test010 {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.google.com/");
			HttpURLConnection c = (HttpURLConnection) url.openConnection();
			c.setDoInput(true); c.setDoOutput(true); c.setRequestMethod("GET");
			int code = c.getResponseCode();
			BufferedReader br;
			if(code==200) {
				br = new BufferedReader(new InputStreamReader(c.getInputStream()));				
			}
			else {
				br = new BufferedReader(new InputStreamReader(c.getErrorStream()));				
			}
			String line =""; StringBuffer sb = new StringBuffer();
			while((line=br.readLine())!=null) {sb.append(line + "\n");}
			System.out.println(sb.toString());
			br.close(); c.disconnect();
		} catch (Exception e) {  e.printStackTrace(); }
	}

}
