package com.company.Portfolio;

import java.util.ArrayList;
import java.util.Iterator;

public class Test002_model {
	public static void main(String[] args) {
		Whiskey1 user = new Whiskey1("곡물향", "Johnnie Walker Black Label");
		System.out.println(user);
		
		ArrayList<Whiskey1> whiskey = new ArrayList<>();
		whiskey.add(new Whiskey1("Glenfiddich 18 Year Old","풍부한"));
		whiskey.add(new Whiskey1("Lagavulin 16 Year Old","진한"));
		whiskey.add(new Whiskey1("Chivas Regal 18 Year Old","바닐라향"));
		System.out.println(whiskey);
		
		
		Iterator<Whiskey1> iter = whiskey.iterator();
		while(iter.hasNext()) {
			Whiskey1 f = iter.next(); 
			System.out.println(f.getName() + "\t" + f.getFlavor());
		}
		
		iter = whiskey.iterator();
		while(iter.hasNext()) {
			Whiskey1 w = iter.next();
		}
		
	}

}
