package com.company.Portfolio;


import java.util.ArrayList;
import java.util.List;

public class Whiskey {
	private int no;
    private String name;
    private List<String> flavors;

    
    public Whiskey(int no, String name, List<String> flavors) {
		super();
		this.no = no;
		this.name = name;
		this.flavors = flavors;
	}
	
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public List<String> getFlavors() { return flavors; }
	public void setFlavors(List<String> flavors) { this.flavors = flavors; }
	@Override public String toString() { return "Name: " + name + ", Flavors: " + flavors; }
}