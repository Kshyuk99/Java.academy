package com.company.day013;
//Set : 주머니  순서 X  , 중복허용 X, add/Iterator[#]/size/remove/contains
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection005_Set {	
	public static void main(String[] args) {
		UserInfo [] arr = new UserInfo[]{ 
		       	new UserInfo("아이언맨",50), new UserInfo("헐크",40),		       	 
		       	new UserInfo("캡틴",120) , new UserInfo("캡틴",120)		       	
		       };
		// HashSet을 이용해 데이터넣기
		Set<UserInfo> set= new HashSet<>();
		set.add(arr[0]); set.add(arr[1]); set.add(arr[2]); set.add(arr[3]);
		System.out.println(set.size()); //3 중복허용 X
		
		//향상된 for
		System.out.println("\n\n= NAME\t AGE=");
		for(UserInfo s : set) {System.out.println(s.getName() + "\t" + s.getAge());}
		
		//Iterator
		System.out.println("\n\n= NAME\t AGE=");
		Iterator<UserInfo> iter = set.iterator(); //1. 줄서기
		while(iter.hasNext()) { //2. 처리대상확인
			UserInfo t= iter.next(); //3. 꺼내오기
			System.out.println(t.getName() + "\t" + t.getAge());
		}
	}
}
