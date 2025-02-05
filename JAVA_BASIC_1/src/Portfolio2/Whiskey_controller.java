package Portfolio2;

import java.util.ArrayList;
import java.util.Scanner;



public class Whiskey_controller {
	public static void main(String[] args) {
		ArrayList<Whiskey> list = new ArrayList<>();
		list.add(new Whiskey("Johnnie Walker Black Label", "스모크향", "곡물향"));
		list.add(new Whiskey("Macallan 12 Year Old", "과실향", "건과일향", "스파이시향"));
		list.add(new Whiskey("Laphroaig 16 Year Old", "피트향(석탄 소금 해조류)", "소금향", "스크램향", "아세톤향"));
		list.add(new Whiskey("Macallan 12 Year Old", "과실향", "건과일향", "스파이시향"));
		
		UserProcess controller = null;
		UserProcess [] crud = {new UserCreate(), new UserRead(), new UserUpdate(), new UserDelete()};
		
		Scanner sc = new Scanner(System.in);
		int num=-1;
		for(;;) {
			System.out.print("\nmenu - 1.create  2.read  3.update  4.delete  5.exit  \n입력>");
			num = sc.nextInt();
			     if( num==5 ) {   System.out.println("프로그램종료"); break; }
			else if( num==1 ) {  controller = crud[0];  controller.exec(list); }  
			else if( num==2 ) {  controller = crud[1];  controller.exec(list); }
			else if( num==3 ) {  controller = crud[2];  controller.exec(list); }
			else if( num==4 ) {  controller = crud[3];  controller.exec(list); }
		}
	}

}
