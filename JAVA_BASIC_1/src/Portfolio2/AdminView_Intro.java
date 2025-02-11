package Portfolio2;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AdminView_Intro {
	JFrame frame = new JFrame("관리자");
	JLabel label; JButton[] btn;
	
	public AdminView_Intro() {
		btn = new JButton[] {new JButton("수정")};
		for(int i=0; i<btn.length; i++) {
			btn[i].setForeground(Color.white);
			btn[i].setBackground(Color.gray);
			btn[i].setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));
		}
	}
	public void show() {
		frame.setLayout(null);
		frame.setResizable(false);
		btn[0].setBounds(150,370, 150,50);
		frame.add(btn[0]);
		frame.setSize(600, 600);  frame.setVisible(true);  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) { new AdminView_Intro().show(); }
	}


