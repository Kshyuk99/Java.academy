package com.company.mini;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// controller
/*
 	<<interface>>    InFoProcess      (  void exec(Arraylist<Info> users)
 	   ↑       ↑             ↑				↑
InfoCreate    InfoRead      InfoUpdate      InfoDelete  
*/
interface InfoProcess{
	Scanner sc = new Scanner(System.in);
	 void exec( ArrayList<Info> users);
}
class InfoCreate implements InfoProcess{
	@Override public void exec(ArrayList<Info> users) {
		System.out.println("1. 등록기능입니다"); 
		Scanner sc = new Scanner(System.in);
		System.out.println("이메일입력 > ");
		users.add(new Info(sc.next()));
		//list.add(new Info("aaa@gmail.com"));
		System.out.println("..............확인 >" + users);
	}
	
}
class InfoRead implements InfoProcess{
	@Override public void exec(ArrayList<Info> users) {
		System.out.println("2. 조회기능입니다"); 
		for(Info u : users) {
			System.out.println(u);
		}	
	}	
}

class InfoUpdate implements InfoProcess{
	
	@Override public void exec(ArrayList<Info> users) {		
		System.out.println("3. 수정기능입니다");
		System.out.print("수정할 유저번호 입력 > "); int b = sc.nextInt();  // get 0부터시작
		System.out.print("수정할 유저이메일 입력 > "); String email = sc.next();
		users.get(b-1).setEmail(email);		
	}	
}

class InfoDelete implements InfoProcess{
	@Override public void exec(ArrayList<Info> users) {
		System.out.println("4. 삭제기능입니다"); 
		System.out.print("삭제할 유저번호 입력 > "); int b= sc.nextInt();		
		//users.remove(c-1);		
		Info finduser = null;  //삭제번호와 사용자의 번호가 같으면  객체담기
		for(Info u: users) {if(b == u.getNo()) {finduser = u; break;}}
		users.remove(finduser); // 그 객체 삭제해주세요
		}
	}	

public class Test002_controller {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Info> list = new ArrayList(); System.out.println(list);
		/*
		InfoProcess controller = null;
		controller = new InfoCreate();  controller.exec(list);
		controller = new InfoRead();  controller.exec(list);
		controller = new InfoUpdate();  controller.exec(list);
		controller = new InfoDelete();  controller.exec(list); */
		// 무한반복 메뉴판  1. 이메일등록 2. 확인  3. 수정  4. 삭제  5. 종료
		/* ver-1
		InfoProcess controller = null;
		int a=-1;
		for(;;) {
			System.out.println("\n\n:::::::::\n1. 등록\n2. 조회\n3. 수정\n4. 삭제\n5. 종료");
			a= sc.nextInt();
			
			if(a==5) {  break; }
			switch(a) {
			case 1 : controller = new InfoCreate();  controller.exec(list); break;
			case 2 : controller = new InfoRead();  controller.exec(list);   break;
			case 3 : controller = new InfoUpdate();  controller.exec(list); break;
			case 4 : controller = new InfoDelete();  controller.exec(list); break;
			}*/
		
		
		//ver-2
		InfoProcess controller = null;
		InfoProcess [] crud = {new InfoCreate(),new InfoRead(),new InfoUpdate(),new InfoDelete() };
		int a=-1;
		for(;;) {
			System.out.println("\n\n:::::::::\n1. 등록\n2. 조회\n3. 수정\n4. 삭제\n5. 종료");
			a= sc.nextInt();			
			if(a==5) {  break; }			
			 controller = crud[a-1];  controller.exec(list); break;			 
		
	}

  }
}
//else if(a==1) {list.get(0).getEmail() System.out.println(list.get(0));}