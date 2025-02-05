package com.company.Portfolio;

import java.util.ArrayList;

public interface UserProcess {
	public void exec(ArrayList<UserInfo> users);	
}
//UserCreate /   UserRead  / UserUpdate  / UserDelete
/*
		<<interface>>   UserProcess  
				    (   void  exec(  ArrayList<UserInfo> users     )                       )	  # 처리			    
				    (   void  exec(  ArrayList<UserInfo> users  , UserView view )     )   # 처리, 화면
		↑        ↑             ↑               ↑
  UserCreate         UserRead   UserUpdate   UserDelete
  # list.add            #get+size   #iterator      #iter.remove      
*/