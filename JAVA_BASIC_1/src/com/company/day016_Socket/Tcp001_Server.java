package com.company.day016_Socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class Tcp001_Server {
	public static void main(String[] args) {
		//1. 서버소켓 - 통신사[ , , , , ]
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(1407);
			System.out.println("[SERVER] 1. 서버준비완료 A/S  2. 기다리는중");
		} catch (IOException e) {  e.printStackTrace(); }
		//2. 클라이언트의 연결요청 상담사(Socket)랑 연결(accept)
		try {
			socket = serverSocket.accept();
			System.out.println("[SERVER] 4. 연결완료");
			Thread sender = new Sender(socket);  sender.start(); //말하기기능
			Thread receiver = new Receiver(socket); receiver.start(); //듣기기능
		} catch (IOException e) {  e.printStackTrace(); }		
		//3. 데이터 주고받기
	}
}////////// Server

//	InputStream > [프로그램] > OutputStream

// 말하기 실행클래스
class Sender extends Thread{ //상속
	Socket socket;  DataOutputStream out;  String who;  SimpleDateFormat sdf;

	public Sender() { super();  }
	public Sender(Socket socket) { // 상대방의 정보()
		super();
		this.socket = socket;
		this.who = "["+ ( socket.getPort() ==1407 ? "Client" : "Server" ) ;
		this.sdf = new SimpleDateFormat("hh:mm:ss ] ");
		try { out = new DataOutputStream(socket.getOutputStream()); } 
		catch (IOException e) {
			e.printStackTrace(); 
			}
		
	}
	
	//2. todo run
	public void run() {
		//Scanner sc = new Scanner(System.in);		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		//															키보드 System.in
		try {
			while(out != null) {
				String data = in.readLine();
				if(data != null) {out.writeUTF(who + sdf.format(System.currentTimeMillis()) + data);  out.flush(); }
			}
		}catch(Exception e) {
			//e.printStackTrace(); 
			}finally {
				try {
					if(out != null) {in.close();}
					if(in != null) {in.close();}
					if(!socket.isClosed()) {socket.close();}
				}catch(Exception e) {  e.printStackTrace(); }
			}
	}	
}


// 듣기 실행클래스
class Receiver extends Thread{ // 1. 상속
	Socket socket;  DataInputStream in;

	public Receiver() { super();  }
	public Receiver(Socket socket) {
		super();
		this.socket = socket; // 정보
		try { in = new DataInputStream( socket.getInputStream()); } //듣기내용키기
		catch (IOException e) {  e.printStackTrace(); }
	}
	
	//2. run 실행클래스 todo 내용
	public void run() {
		try {
			while(in != null) { System.out.println(in.readUTF()); } 
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println("연결 마무리 >>" + socket);
			}finally {
				try {
					if(in != null) {in.close();}
					if(!socket.isClosed()) {socket.close();}
				}catch(Exception e) {  e.printStackTrace(); }
			}
	
	}
}//end receiver

