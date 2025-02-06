package Portfolio2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;



public class UserView_crud {
	
	JFrame frame;	
	JScrollPane scroll; JTable table; String[] column; Object[][] rowData;	DefaultTableModel model; 
	JPanel panel; JButton[] button;
	
	
	public UserView_crud() {
		frame = new JFrame("WhiskeyRecommendation");
		
		panel = new JPanel();
		button = new JButton[] {new JButton("등록"), new JButton("수정"), new JButton("삭제"), new JButton("종료") };
		
		column = new String[] {"NUM", "NO", "NAME", "FLAVORS"};
		rowData = new Object[][] {};
		model = new DefaultTableModel(rowData, column);
		table = new JTable(model);
		scroll = new JScrollPane(table);
		for(int i=0; i<button.length; i++) {
			button[i].setBackground(Color.GRAY);
			button[i].setForeground(Color.white);
			button[i].setFont(new Font( Font.SANS_SERIF , Font.ITALIC , 15));
		}
		
		table.setBackground(new Color(255,200,200));  
		table.setRowHeight(25);
		
		table.getTableHeader().setReorderingAllowed(false); 
		
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); 
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		for(int i=0; i<table.getColumnCount(); i++) {
			table.getColumn(column[i]).setCellRenderer(dtcr);
		}
	}
	
	
	void show() { 
		frame.setResizable(false);
		frame.setLayout(new BorderLayout()); 
		frame.add(scroll, BorderLayout.CENTER);
		frame.add(panel, BorderLayout.SOUTH);
		for(int i=0; i<button.length; i++) {panel.add(button[i]);}		
		frame.setSize(400,300);  frame.setVisible(true);  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	

	public static void main(String[] args) {new UserView_crud().show();  }

	
}
