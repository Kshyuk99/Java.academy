package com.company.day007;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수)
class UserCard{
	//멤버변수 (static변수, 인스턴스변수, 지역변수)
	int cardNum;  //인스턴스변수 - heap area - new - this.cardNum
	boolean isMembership; // 인스턴스변수 - heap - new - this.isMembership
	static int width=10; // static(클래스)변수 - method area
	static int height=10; // static(클래스)변수 - method area
	static { width=100; height=100; }
	public UserCard() {cardNum=1;}	
	//					  지역변수,   지역변수
	public UserCard(int cardNum, boolean isMembership) {super();this.cardNum = cardNum;this.isMembership = isMembership;}
	//멤버함수
	String info() {return cardNum + ((isMembership)?"M":"");}	
	
}
/*3.	 			UserCard 초기화순서
 		 			기본값		명시적초기화(cardNum=1)  초기화블록{}  생성자
 width(static)  	 0			10						100		 X (new X)
 height(static)		 0			10						100		 X (new X)
 cardNum			 0			0						0		 1			
 isMembership		false		false					false    false
 */
public class A001_UserCard {
	public static void main(String[] args) {
		System.out.println(UserCard.width + "/" + UserCard.height); // static - new X
		UserCard card1 = new UserCard(); System.out.println(card1.info()); 
		UserCard card2 = new UserCard(2 ,true); System.out.println(card2.info()); 
		//1. new 공간빌리기 2. 초기화 3. card1 지번
	}

}
/*   
--------------------------------
[method : 정보, static, final] UserCard , A001_UserCard, width,height
--------------------------------
[heap : 동적]    				|[stack: 잠깐빌리기]
2번지 UserCard(2,true)		<- card1 [2번지]
1번지 UserCard(1,false)		<- card1 [1번지]					
               				| main()
---------------------------------
*/