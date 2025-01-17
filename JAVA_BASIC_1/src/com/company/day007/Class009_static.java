package com.company.day007;

/*										기본값		명시적초기화()  초기화블록{}  생성자
 * 1) static    클래스변수/클래스메서드			 1				2			3		X
   2) instance  인스턴스변수/인스턴스메서드		 4				5			6		7(new 사용)
 
 */
class AnimalFarm{ 
	//멤버변수
	String name;  // 인스턴스변수 - heap new - this.name
	int age; 	  // 인스턴스변수 - heap new - this.age
	static String Company="(주)동물농장"; // 클래스 변수 (static 변수) - method - new X
	static int num =10; static String boss; static String location; // 클래스변수
	static { boss="신동엽"; location="여의도";}	
	//멤버함수 
	static void num_plus() {/*name="";*/num++;} // 클래스메서드(static 메서드) 인스턴스 사용불가
	// 인스턴스메서드
	void show() {
		System.out.println(":: 회사명: " + AnimalFarm.Company);
		System.out.println(":: 식구수: " + AnimalFarm.num);
		System.out.println(":: 이름: " + this.name);
		System.out.println(":: 나이: " + this.age);
	}
	
}

public class Class009_static {
	public static void main(String[] args) {
		AnimalFarm cat = new AnimalFarm();
		cat.name="sally";  cat.age=10;  cat.show();
		
		System.out.println();
		//cat.num_plus();         cat.show();
		AnimalFarm.num_plus();    cat.show();
		// new X , method area에 올라가있음!
	}

}
/*   AnimalFarm cat = new AnimalFarm();
--------------------------------
[method : 정보, static, final] AnimalFarm, class Class009 / Company, num, boss, location
							  num_plus()
--------------------------------
[heap : 동적]    				|[stack: 잠깐빌리기]
1번 AnimalFarm 
(name=sally, age=10)		<- cat [1번지]		
               				| main()
---------------------------------
*/


