package com.company.Portfolio;

import java.util.ArrayList;
import java.util.Iterator;

public class UserRead implements UserProcess{
	@Override
	public void exec(ArrayList<UserInfo> users) {
		System.out.println("..........2. read");
		Iterator<UserInfo> iter = users.iterator();
		while(iter.hasNext()) {
			UserInfo t = iter.next();
			System.out.println(t.getName() + "\t" + t.getEmail());
		}
	}
	
}
