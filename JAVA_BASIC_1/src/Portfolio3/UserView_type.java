package Portfolio3;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UserView_type {

    JFrame frame; 
    JLabel label1;  JButton[] button;
    JLabel label2;  
    

    public UserView_type() {
        frame = new JFrame("RecommendPage");      
             
        label1 = new JLabel();
        label2 = new JLabel();    
        
        
        String [] type = { "RED", "WHITE"  };
        button = new JButton[] {
        		new JButton("취향확인"),
        		new JButton("추천받기")
        		};
        
        for (int i = 0; i < button.length; i++) {
        	button[i].setBackground(Color.GRAY);
        	button[i].setForeground(Color.white);
        	button[i].setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 15));
        }
        for(int i=0; i<type.length; i++) {
        	List<String> color = new ArrayList<>();
        	color.add(type[i]);
        }
        
        String [] flvaors = {"스모크향", "과실향", "소금향", "피트향", "카라멜향",
        		"피트향", "스크램향", "아세톤향", "바닐라향", "초콜릿향", "스파이시향",
        		"꿀향", "건과일향", "계피향", "민트향"};        
      
    }    

    public void show() {
		frame.setLayout(null); 
		frame.setResizable(false);
		
		label1.setBounds(95,0,128,128);
		label2.setBounds(95,0,128,128);
		button[0].setBounds(220,370 , 150,70);
		button[1].setBounds(220,450 , 150,70);
		
		frame.add(label1); frame.add(label2); frame.add(button[0]);  frame.add(button[1]);
		frame.setSize(600, 600);  frame.setVisible(true);  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
    public static void main(String[] args) { new UserView_type().show(); }
}

/*
1. 19세
2. 취향체크
    TYPE 
	[RED][WHITE]

    flavors
	[스모크향] [곡물향] [민트향] [카라멜향] 
    
    [추천받기]  
    [전체리스트확인] 

3. 랜덤
   추천받은 리스트나오기
*/