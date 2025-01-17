package com.company.day007;

//다음코드에서 오류나는 부분을 찾아 주석달고 이유를 적으시오.
class User002 {
	final String nation = "Korea";  //변경하지마
	final String jumin;  // 변경하지마
	String name;
	
	
	public User002() { jumin="0000-0000";}
	public User002(String jumin, String name) {
		this.jumin = jumin;
		this.name = name;
	}
}
//   			  기본값 -> 명시적 초기화 -> 초기화블록 -> 생성자
// jumin			null   null			null		사용자에게 입력받음 ...상수 변경하지마
public class Class011_Ex {
	public static void main(String[] args) {
		User002 user1 = new User002("123456-1234567", "아이유");	    
		System.out.println(user1);   
		
		//user1.nation = "USA";      // 값변경불가
		//user1.jumin  = "123123-1234321";   // 값변경불가
		user1.name = "IU"; 
		System.out.println(user1);   
	}
}
