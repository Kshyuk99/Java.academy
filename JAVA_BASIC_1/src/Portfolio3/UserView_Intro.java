package Portfolio3;

import java.awt.Color;
import java.awt.Font;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class UserView_Intro {
   
   JFrame frame; 
   JLabel label;  ImageIcon icon; 
   JButton [] btns;  JButton [] start;
   JLabel label2;
   public UserView_Intro() {
      frame = new JFrame("WhiskeyRecommendation");      
      //icon = new ImageIcon("images\\logo.png");      
      label = new JLabel(icon);
      btns = new JButton[] { new JButton("예") };
      start = new JButton[] {new JButton("아니오")};
      label2 = new JLabel("만 19세 이상입니까?");
      label2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
      label2.setForeground(Color.BLACK);
      
      for(int i=0; i<btns.length; i++) {
         btns[i].setBackground(Color.GRAY);
         btns[i].setForeground(Color.white);
         btns[i].setFont(new Font( Font.SANS_SERIF , Font.BOLD , 15));
         
      }
      for(int i=0; i<start.length; i++) {
         start[i].setBackground(Color.GRAY);
         start[i].setForeground(Color.white);
         start[i].setFont(new Font( Font.SANS_SERIF , Font.BOLD , 15));
      
   }   
}
   
   public void show() {
      frame.setLayout(null); 
      frame.setResizable(false);      
      label.setBounds(95,0,128,128);  
      //btns[0].setBounds(150,370 , 300,50);
      label2.setBounds(200, 300, 300, 30);
      btns[0].setBounds(150,370 , 150,50);
      start[0].setBounds(300,370 , 150,50);      
      frame.add(label); frame.add(btns[0]); 
      frame.add(label); frame.add(start[0]); 
      frame.add(label2);
      frame.setSize(600, 600);  frame.setVisible(true);  
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
   }
   public static void main(String[] args) { new UserView_Intro().show(); }
}