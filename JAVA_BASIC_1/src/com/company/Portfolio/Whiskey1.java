package com.company.Portfolio;

public class Whiskey1 {
	private int no;
	private String name;
	private String flavor;
	public Whiskey1() { super();  }	
	public Whiskey1(int no, String name, String flavor) {
		super();
		this.no = no;
		this.name = name;
		this.flavor = flavor;
	}
	public Whiskey1(String string, String string2) { }
	@Override public String toString() { return "Whiskey1 [no=" + no + ", name=" + name + ", flavor=" + flavor + "]"; }
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getFlavor() { return flavor; }
	public void setFlavor(String flavor) { this.flavor = flavor; }
	
}
