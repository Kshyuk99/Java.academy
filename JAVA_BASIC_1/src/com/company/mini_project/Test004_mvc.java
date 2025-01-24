package com.company.mini_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
//1. 클래스는 부품객체
//2. 멤버변수 / 멤버함수
//3. MVC_using 조립
/*		합성관계(composition)
 		   MVC_using
 		 model     view           controller
		   ◆       ◆        		◆ 
	List<Info>   View_intro		cotroller
				 View_crud      [] process

*/
import java.util.List;

import javax.swing.JOptionPane;

class MVC_using{
	////////멤버변수
	//model
	ArrayList<Info> list;
	//view
	View_intro intro;
	View_crud crud;
	//controller
	InfoProcess controller;
	InfoProcess [] process; // InfoCreate, InfoRead, InfoUpdate, InfoDelte
	
	
	public MVC_using() {
		list  = new ArrayList<>();
		intro = new View_intro();
		crud  = new View_crud();  intro.show();
		process = new InfoProcess[] {
				new InfoCreate(), new InfoUpdate(), new InfoDelete(), new InfoRead()
		};
	}
	///// 멤버함수
	//intro
	public void step1() {
		intro.button.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				intro.frame.dispose(); //화면꺼지고
				crud.show(); // 두번째창 열림
				step2();
				
			}});
	}
	//crud의 버튼 이벤트들
	public void step2() {
		String[] msg = new String[] {"추가기능입니다.", "수정기능입니다.", "삭제기능입니다."};
		
		//interface : public static final / abstract
		//익명이너클래스	
		/*
		for(int i=0; i<3; i++) {		
		crud.button[i].addActionListener(new ActionListener() { // interface
			//final
			@Override public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null , msg[i]); //final
				controller = process[i];
				controller.exec(list); // arrayList 처리 , view갱신필요
			}
		});
	}*/
		crud.button[0].addActionListener(new ActionListener() { // interface
			//final
			@Override public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null , msg[0]);
				controller = process[0];
				controller.exec(list, crud); // arrayList 처리 , view갱신필요
		}
	});
		
		crud.button[1].addActionListener(new ActionListener() { // interface
			//final
			@Override public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null , msg[1]);
				controller = process[1];
				controller.exec(list, crud); // arrayList 처리 , view갱신필요
		}
	});
		
		crud.button[2].addActionListener(new ActionListener() { // interface
			//final
			@Override public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null , msg[2]);
				controller = process[2];
				controller.exec(list, crud); // arrayList 처리 , view갱신필요
		}
	});
		
		crud.button[3].addActionListener(new ActionListener() { // interface
			//final
			@Override public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null , "프로그램을 종료합니다";
				crud.frame.dispose();
		}
	});
		
	}		
}

public class Test004_mvc {
	public static void main(String[] args) {
		new MVC_using().step1();
	}

}
/*
 

 */