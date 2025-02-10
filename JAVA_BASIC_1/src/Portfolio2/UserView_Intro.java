package Portfolio2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class UserView_Intro {
	
	JFrame frame;
	JLabel label;  ImageIcon icon; 
	JButton [] btns;
	
	public UserView_Intro() {
		frame = new JFrame("WhiskeyRecommendation");
		//icon = new ImageIcon("images\\logo.png");
		label = new JLabel(icon);
		btns = new JButton[] { new JButton("시작하기") };
		
		for(int i=0; i<btns.length; i++) {
			btns[i].setBackground(Color.GRAY);
			btns[i].setForeground(Color.white);
			btns[i].setFont(new Font( Font.SANS_SERIF , Font.BOLD , 15));
			
		}
	}	
	
	public void show() {
		frame.setLayout(null); 
		frame.setResizable(false);
		
		label.setBounds(95,0,128,128);  
		btns[0].setBounds(150,370 , 300,50);		
		
		frame.add(label); frame.add(btns[0]); 
		frame.setSize(600, 600);  frame.setVisible(true);  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) { new UserView_Intro().show(); }
}