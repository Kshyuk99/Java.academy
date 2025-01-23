package com.company.day011_thread;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//1. 클래스는 부품객체
//2. 부품객체 조립
/*		SwingGui001   합성관계(composition)
		◆     ◆ 
	 JFrame  JButton
*/
class SwingGui001{
	//멤버변수
	JFrame frame;     //틀  
	JButton button;  //버튼	
	//생성자
	public SwingGui001() {
		this.frame = new JFrame("BOX");
		this.button = new JButton("CLICK");
	}	
	//멤버함수
	public void show() { // c
		button.setBackground(Color.black);//Q1. 버튼의 배경색상 설정(set)  background
		button.setForeground(Color.white);//Q2.		글자색상 설정(set) foreground
		button.setFont( new Font(Font.MONOSPACED, Font.ITALIC, 30));//Q3. 글자모양 - font
		
		button.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(button, "WELCOME");
				
			}});
		
		frame.add(button);
		frame.setSize(300,300);
		frame.setVisible(true);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 클릭시 닫기기능
	}
}
public class Gui001 {
	public static void main(String[] args) {
		new SwingGui001().show();
	}//end main
}// end class
