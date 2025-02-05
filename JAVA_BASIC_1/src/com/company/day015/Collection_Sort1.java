package com.company.day015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


//1. Dto  class UserInfo{private int no; private String name; private int age;}
//2. ArrayList 작성
//3. list데이터 넣기  1,aaa, 10 / 2,bbb, 12 / 3,ccc, 13
//4. 나이순으로 정렬
class UserInfo extends Object{
	private int no;
	private String name;
	private int age;
	
	public UserInfo() { super();  }
	public UserInfo(int no, String name, int age) { super(); this.no = no; this.name = name; this.age = age; }
	@Override public String toString() { return "UserInfo [no=" + no + ", name=" + name + ", age=" + age + "]"; }
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	
}

public class Collection_Sort1 {
	public static void main(String[] args) {
		ArrayList<UserInfo> list = new ArrayList();
		list.add(new UserInfo(1,"aaa",10));
		list.add(new UserInfo(2,"bbb",12));
		list.add(new UserInfo(3,"ccc",13));
		System.out.println(list+"\n");
		// sort(List<T> list, Comparator<? super T> c)
		// 1. Comparator -> interface -> new Comparator<>(){}
		// 2. <? super UserInfo>  UserInfo 포함 부모
		Collections.sort(list, new Comparator<UserInfo>() {
			@Override public int compare(UserInfo o1, UserInfo o2) {  //o1와 o2비교
				//1. 이름 오름차순
				//return o1.getName().compareTo(o2.getName()); 
				//2. 이름 내림차순
				//return o2.getName().compareTo(o1.getName());
				//3. 나이 오름차순
				//return o1.getAge() - o2.getAge(); 
				//4. 나이 내림차순
				return o2.getAge() - o1.getAge();  // o2.getAge() < o1.getAge()  -1/ == 0 / > 1
				}
			});
			System.out.println(list);
		
	}
}
