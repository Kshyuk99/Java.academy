package com.company.day007;
import com.company.day007_etc.Cat;

public class Class012_Modifier_private {  // 외부클래스
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.pub = 1;
		//cat.setPri(4);  // private - 안보이게 숨기는 기능, set변수형 - 값을 세팅할때
		//System.out.println(cat.getPri()); // 		 get변수명 - 값 가져오기
	}

}
/* public (아무데서나) > protected(extends) > package(같은 폴더) > private(Cat 내부)
  
 
 */