package com.company.portfolio;

import java.util.Calendar;

public class UserInfo {
	public static int cnt=0;
	private int no;
	private String name;  //getters + setters
	private String email;
	private String date;
	public UserInfo() { super();  }
	public UserInfo(int no, String name, String email, String date) {
		super();		
		this.no = no;
		this.name = name;
		this.email = email;
		this.date = date;
	}
	
	public UserInfo(String name, String email) {
		this.no=++cnt;
		this.name = name;
		this.email = email;
		Calendar today = Calendar.getInstance();
		this.date = today.get(1) + "-" + today.get(2) + "-" + today.get(5);
		//               년                   월                    일
	}
	@Override public String toString() { return "UserInfo [cnt=" + cnt + ", no=" + no + ", name=" + name + ", email=" + email + ", date=" + date + "]"; }
	public int getCnt() { return cnt; }
	public void setCnt(int cnt) { this.cnt = cnt; }
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	public String getDate() { return date; }
	public void setDate(String date) { this.date = date; }
	
	
	
}
