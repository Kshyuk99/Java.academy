package com.company.portfolio;

import java.util.ArrayList;
import java.util.Iterator;

public class Test002_model {
	public static void main(String[] args) {
		UserInfo1 user = new UserInfo1("곡물향", "Johnnie Walker Black Label");
		System.out.println(user);
		
		ArrayList<UserInfo1> list = new ArrayList<>();
		list.add(new UserInfo1("풍부한", "Glenfiddich 18 Year Old"));
		list.add(new UserInfo1("진한", "Lagavulin 16 Year Old"));
		list.add(new UserInfo1("바닐라향", "Chivas Regal 18 Year Old"));
		System.out.println(list);
		
		
		Iterator<UserInfo1> iter = list.iterator();
		while(iter.hasNext()) {
			UserInfo1 f = iter.next(); 
			System.out.println(f.getName() + "\t" + f.getFlavor());
		}
		
	}

}
