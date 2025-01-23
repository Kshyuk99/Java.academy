package com.company.mini;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//1. 클래스는 부품객체
//2. 부품객체 조립
/*		View_intro   합성관계(composition)
		◆     ◆ 
	JFrame  JButton
	
1) button - 배경/ 글자색/ font 좋아하는 글꼴 설정
2) frame  - 300,200
*/
/*4. 	View_crud
 		◆     ◆ 				  ◆			◆
	JFrame  JScrollPane(JTable)   JPanel    		JButton[]
*/
class View_intro{
	JFrame frame;
	JButton button;
	public View_intro() {
		this.frame = new JFrame("INTRO");
		this.button = new JButton("WELCOME");
	}
	
	public void show() {
	frame.add(button);
	frame.setSize(300, 200);
	frame.setVisible(true);
	button.setBackground(Color.black);
	button.setForeground(Color.white);
	button.setFont( new Font(Font.MONOSPACED, Font.ITALIC, 30));
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class View_crud{
	JFrame frame;//0. 전체틀	
	//1. JTable
	JScrollPane scroll;  JTable table;  // scroll(넘쳤을때 처리) / table(표)
	String [] column;    Object[][] rowData;  // 각칸들 / 줄-레코드 -줄단위데이터
	DefaultTableModel model;  // 데이터를 동적 추가, 삭제
	//2. 버튼영역
	JPanel panel; JButton[] button; 
	////////////////// 생성자		
	public View_crud() {
		frame = new JFrame("USERINFO");
		panel = new JPanel();
		button = new JButton[] {
		   new JButton("ADD"), new JButton("UPDATE"), new JButton("DELETE"), new JButton("CLOSE")};
		column = new String[] {"NO", "EMAIL"}; // 각칸
		rowData = new  Object[][] {}; // 줄단위 데이터
		model = new DefaultTableModel(rowData, column); // 동적데이터 처리
		table = new JTable(model);
        scroll = new JScrollPane(table);
	}
	/////////////////멤버함수
	public void show() {
		//Q1. frame - BorderLayout 이용
		//Q2. scroll - BorderLayout.CENTER 배치
		//Q3. panel  - BorderLayout.SOUTH 배치
		//Q4. frame.add 이용 / scroll, panel 부착
		//Q5. panel.add 이용 / 버튼4개 부착
		//Q6. setSize  400,300
		//Q7. setVisible true
		
		frame.setLayout(new BorderLayout());		
		frame.add(scroll, BorderLayout.CENTER);
		frame.add(panel, BorderLayout.SOUTH);
		for(int i=0; i<button.length; i++) {panel.add(button[i]);}
		frame.setSize(400, 300 );
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
}

public class Test003_view {
	public static void main(String[] args) {
		//new View_intro().show();
		//new View_crud().show();
		
		View_crud crud = new View_crud();
		
		//1. 데이터추가 - add
		Object[] data = {1,"aaa@gmail.com"};
		crud.model.addRow(data);
		
		//2. 데이터 삭제
		crud.model.removeRow(0);
		
		crud.show();
	}

}
