package com.company.day011_thread;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//1. 클래스는 부품객체
//2. 부품객체 조립
/*		SwingGui001   합성관계(composition)
				◆     ◆ 
			JFrame  JButton
*/
class SwingGui002{
	JFrame frame;  // 틀
	JButton[] button; // 버튼들
	// alt+shift+s 2번째
	public SwingGui002() {
		frame  = new JFrame("LAYOUT");
		button = new JButton[6]; // 6개 공간빌려옴
		for(int i=0; i<button.length; i++) {button[i] = new JButton("BTN" + (i+1));}
	}
	public void show() { // frame.add(컴포넌트)  2. frame.setSize()  3. frame.setVisible
		frame.setLayout(new GridLayout(2,2));
		frame.add(button[0]);
		frame.add(button[1]);
		frame.add(button[2]);
		frame.add(button[3]); 
		
		/*frame.setLayout(new BorderLayout());
		frame.add(button[0] , BorderLayout.NORTH);  //북쪽
		frame.add(button[1] , BorderLayout.SOUTH);  //남쪽
		frame.add(button[2] , BorderLayout.EAST);
		frame.add(button[3] , BorderLayout.WEST);
		*/
		frame.setSize(300,300);
		frame.setVisible(true);		
	}
	
}//end class


public class Gui002_layout {
	public static void main(String[] args) {
		new SwingGui002().show();
	}

}
