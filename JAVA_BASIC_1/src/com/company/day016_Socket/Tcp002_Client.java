package com.company.day016_Socket;

import java.net.Socket;

public class Tcp002_Client {
	public static void main(String[] args) {
		// 2. 통신사 - 서버소켓이 열렸는지 확인하고 (Server 먼저 실행)
		Socket socket = null;
		
		try {
			socket = new Socket("127.0.0.1" , 1407);
			System.out.println("[CLIENT] 3. A/S 문의");
			
			Thread sender = new Sender(socket);  sender.start(); //말하기기능
			Thread receiver = new Receiver(socket); receiver.start(); //듣기기능
		} catch (Exception e) {  e.printStackTrace(); }
		
		// 3. 문의하기(Socket)
	}
}
