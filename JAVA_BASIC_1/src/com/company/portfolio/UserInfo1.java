package com.company.portfolio;

public class UserInfo1 {	
	private String name;
	private String flavor;
	public UserInfo1() { super();  }
	public UserInfo1(String name, String flavor) {
		super();
		this.name = name;
		this.flavor = flavor;
	}
	
	@Override public String toString() { return "UserInfo1 [name=" + name + ", flavor=" + flavor + "]"; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getFlavor() { return flavor; }
	public void setFlavor(String flavor) { this.flavor = flavor; }


}
