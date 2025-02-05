package com.company.Portfolio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UserDelete implements UserProcess{
	@Override public void exec(ArrayList<UserInfo> users) {
		System.out.println("..........4. delete");
		Iterator<UserInfo> iter=users.iterator();  //1)줄을 서시오

		Scanner scanner = new Scanner(System.in);
		System.out.print("no > ");     int no = scanner.nextInt();
		
		while(iter.hasNext()) {  //2)처리대상확인
			UserInfo u= iter.next(); //3)꺼내오기
			//if( no가 2이라면 ) { abc@gmail.com으로 변경  }
			if(u.getNo() == no) { iter.remove(); break; }  // iter가 가리키는 친구를 지워주세요!
		}
		
	}
}
