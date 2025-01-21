package com.company.day009;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//1. 클래스는 부품객체
//2. 조립
class MyView2{  //클릭이벤트 #1
	//멤버변수 (frame / button)
	JFrame frame;  JButton button;  // 부품 new 생성자
	//멤버함수
	public MyView2() {
		this.frame  = new JFrame("box");
		this.button = new JButton("btn");
	
	}
	public void create() {  // 셋팅set / 가져올때 get / add, get, size, remove
		//2-1. frame.add(컴포넌트)
		frame.add(button);  // 부모는 자식을 담을수 있다
		//2-2. frame.setSize(300,300)
		frame.setSize(300, 300);
		//2-3. frame.setVisible()
		frame.setVisible(true);	
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "click");				
			}//2) 한번쓰고 버릴목적
			//3) new 인터페이스명(){implements 구현 메서드}			
		}); //#3 이벤트걸기
	}
	
}

public class Gui001_1 {
	public static void main(String[] args) {
		new MyView2().create();
	}

}
