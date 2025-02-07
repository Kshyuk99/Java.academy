package Test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Test008 {
   public static void main(String[] args) {
	       UserInfo [] arr = new UserInfo[]{ 
	       	new UserInfo("아이언맨",30), 
	       	new UserInfo("헐크",40), 
	       	new UserInfo("캡틴",80) };   	       
	       List<UserInfo> list = new ArrayList<>();	       
	       for(int i=0; i<arr.length; i++) {
	    	   list.add(arr[i]);
	       }
	       
	       Iterator <UserInfo> iter = list.iterator(); 
	       while(iter.hasNext()) { 
	    	   UserInfo temp = iter.next();
	    	   System.out.println(temp.getName()+ "\t" + temp.getAge());
	       }
	   }
	}


