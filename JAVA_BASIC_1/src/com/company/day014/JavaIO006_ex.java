package com.company.day014;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;


public class JavaIO006_ex {
	public static void main(String[] args) throws Exception {
		
		
		Calendar today = Calendar.getInstance();
		String folder_rel="src/com/company/day014/";				
		String file_rel="file006_"+today.get(1) +"-" +(today.get(2)+1)+"-" +today.get(5) +".txt";
		//								년       		월(0~11)					일
		
		//1. folder+file 준비
		// Calendar 이용해서 file006_2025204.txt 파일명변경
		
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_rel);
		
		try {
			if(!folder.exists()) {folder.mkdir();}
			if(!file.exists()) {file.createNewFile();}
			System.out.println("폴더/파일");
		}catch(Exception e) {e.printStackTrace();}
		
		//2. 파일 쓰기 
		//	    InputStream > [program] > OutputStream[#]
		// BufferedWriter(속도향상) - OutputStreamWriter(단어) - FileOutputStream(byte)
		/*입력하기 -file005.txt 읽어들이기
		1  white  1200 
		2  choco  1500 
		3  banana 1800 
		*/
		InputStream is = new FileInputStream(file);  //읽어들일 파일
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
		bw.write("1,white,1200\n");
		bw.write("2,choco,1500\n");
		bw.write("3,banana,1800\n");
		//int cnt1=0;
		//while((cnt1= is.read())!=-1) {bw.write(cnt1);}
		bw.flush(); bw.close();
		
		
		//3. 파일읽기(byte)
		//	   [#] InputStream > [program] > OutputStream
		// BufferedReader(속도향상) - InputStreamReader(단어) - FileInputStream(byte)
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		String line ="";
		StringBuffer sb = new StringBuffer();
		while((line=br.readLine())!=null) {sb.append(line+"\n");}
		System.out.println(sb.toString());
		br.close();
		
		//4. 파일검색
		/* 원하는 우유번호를 입력하시오. _번호입력 예) 1
		   1  white  1200
		   
		   csv
		   
		   변수 < 배열 < 클래스 < 콜렉션프레임워크(List, Set, Map) < 파일 < DB
		 */
		String result = sb.toString();
		
		//3. ArrayList 만들기
		ArrayList<Milk> list = new ArrayList();
		
		String[] arr = result.split("\n");
		for(String data : arr) {
			String[] d = data.split(",");   // 1    white   1200
			//System.out.println(d[0] + "/" + d[1] + "/" + d[2]);
			//4. list에 데이터 담기   list.add(new Milk(d[0], d[1], d[2]))
			list.add(new Milk(Integer.parseInt( d[0]), d[1],Integer.parseInt (d[2]))); // String -> Integer Integer.parseInt()
			
		}
		System.out.println(list);
		//5. 사용자에게 번호 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 우유 > ");
		int no= sc.nextInt();
		//6. 입력받은 번호가 해당번호와 같다면 해당데이터 출력
		//if(no == list.get(0).getNo()) {System.out.println(list.get(0));}
		//if(no == list.get(1).getNo()) {System.out.println(list.get(1));}
		//if(no == list.get(2).getNo()) {System.out.println(list.get(2));}
		for(int i=0; i<list.size(); i++) {
			if(no == list.get(i).getNo()) {System.out.println(list.get(i)); break;}
		}		
	}

}
class Milk {
	private int no;
	private String name;
	private int price;
	public Milk() { super();  }
	public Milk(int no, String name, int price) { super(); this.no = no; this.name = name; this.price = price; }	
	@Override public String toString() { return "Milk [no=" + no + ", name=" + name + ", price=" + price + "]"; }
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }	
	
}
