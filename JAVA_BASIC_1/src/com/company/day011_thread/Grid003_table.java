package com.company.day011_thread;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

//1. 클래스는 부품객체
//2. 부품객체 조립
/*		SwingGui003   합성관계(composition)
				◆     ◆ 
			JFrame  JTable
*/
class SwingGui003{
	JFrame frame;
	JTable table;  String[] column;  Object rowData[][];
	JScrollPane scroll;
	public SwingGui003() {
		frame = new JFrame("TABLE");
		//1. data준비
		
		 column =new String[]{ "NO", "NAME", "PRICE", "DESC" };
	      rowData  = new Object [][]{
	         { 1, "WHITE", 1000, "우유는 하얗다" }, { 2, "CHOCO", 1200, "초코는 검정다" },
	         { 3, "BANANA",1300, "바나나는 노랗다" } };
	    //2. TABLE에 넣기
	         table = new JTable(rowData, column);
	         scroll = new JScrollPane(table);
	}
	public void show() {
		frame.add(scroll);  frame.setSize(300, 300 );  frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
public class Grid003_table {
	public static void main(String[] args) {
		new SwingGui003().show();
	}

}
