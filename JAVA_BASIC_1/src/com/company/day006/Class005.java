package com.company.day006;

class MyPrice002{	
	String name;  int price;
		
	void show(){
		System.out.println("상품이름 : " + name+ "\n" + "상품가격 : " + price);
	}	
	public MyPrice002() {
		{name ="갤럭시노트12"; price=110000;} // alt + shift + s
	}	
}


public class Class005 {
	public static void main(String[] args) {
		MyPrice002 product = new MyPrice002();
		product.show(); //3. 3-1) new(heap) 1번지  3-2) MyPrice002() null, 0초기화
						//   3-3) p는 1번지
	}

}
/* RUNTIMEDATA AREA  
--------------------------------
[method : 정보, static, final]  MyPrice002, Class005
--------------------------------
[heap : 동적]    						|[stack: 잠깐빌리기]
1번지 객체생성
MyPrice002(){ name=갤럭시노트12, price=110000 } <- [1번지]
               						| main()
---------------------------------
*/