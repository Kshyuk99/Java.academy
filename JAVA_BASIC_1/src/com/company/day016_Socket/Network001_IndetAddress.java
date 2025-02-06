package com.company.day016_Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Network001_IndetAddress {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("1. IP HostName : " + local.getHostName());
			System.out.println("2. IP HostAddress : " + local.getHostAddress());
			
			local = InetAddress.getByName("www.naver.com");
			System.out.println("3. naver : " + local);
			
		} catch (UnknownHostException e) {  e.printStackTrace(); }
	}
}
