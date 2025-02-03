package com.company.portfolio;

import java.util.ArrayList;
import java.util.Iterator;

public class Test001_model_ArrayList {
	public static void main(String[] args) {
		//0. UserInfo
		UserInfo user = new UserInfo("first", "first@gmail.com");
		System.out.println(user);
		
		//1. ArrayList Test
		// 기차 : index O, 중복허용O, add,get,size,remove,contains
		// 유저추가 : add
		ArrayList<UserInfo> list = new ArrayList<>();
		list.add(new UserInfo("aaa", "aaa@gmail.com"));
		list.add(new UserInfo("bbb", "bbb@gmail.com"));
		list.add(new UserInfo("ccc", "ccc@gmail.com"));
		System.out.println(list);
		
		//2. (read) Iterator 이용해서 전체 데이터 출력
		Iterator<UserInfo> iter = list.iterator();
		while(iter.hasNext()) {
			UserInfo t = iter.next();
			System.out.println(t.getName() + "\t" + t.getEmail());
		}
		//3. (update) no가 2이라면 abc@gmail.com으로 변경
		iter = list.iterator();
		while(iter.hasNext()) {
			UserInfo t = iter.next();
			//if(no가 2라면){abc@gmail.com으로 변경}
			if(t.getNo()==2) { t.setEmail("abc@gmail.com");  break; }
			
		}
		
		//4. (delete) no가 1번인 데이터 삭제
		iter = list.iterator(); //1)줄세우기
		while(iter.hasNext()) { //2)처리대상 확인
			UserInfo t = iter.next(); //3)꺼내오기
			if(t.getNo()==2) { iter.remove();  break; }			
		}
		System.out.println(list);
	}

}
