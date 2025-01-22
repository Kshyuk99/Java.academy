package com.company.day010_collection;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
public class List002 {
	public static void main(String[] args) {
		//1. 입력
		//2. 알림창
		//String num = JOptionPane.showInputDialog("1,2,3중에 입력해주세요");		
		//JOptionPane.showMessageDialog(null, answer);
		List<String> list = new ArrayList();
		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		int answer = Integer.parseInt(JOptionPane.showInputDialog("1,2,3중에 입력"));
			
		/*
		if(answer == 1) {JOptionPane.showMessageDialog(null, list.get(0));}
		else if(answer == 2) {JOptionPane.showMessageDialog(null, list.get(1));}
		else if(answer == 3) {JOptionPane.showMessageDialog(null, list.get(2));}
		*/
		
		/*
		for(int i =0; i<list.size(); i++) {
			if(answer == i) {JOptionPane.showMessageDialog(null, list.get(i-1)); break;}
		} */
			
		JOptionPane.showMessageDialog(null, list.get(answer-1));	
	
	}

}
