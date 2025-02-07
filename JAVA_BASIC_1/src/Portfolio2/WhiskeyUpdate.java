package Portfolio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

class WhiskeyUpdate implements WhiskeyProcess {
    @Override
    public void exec(ArrayList<Whiskey> whiskeys) {
        System.out.println("..........3. update");
        Scanner sc = new Scanner(System.in);
        
        while(true) {
	        System.out.print("수정할 위스키 이름 또는 번호 > ");
	        String input = sc.nextLine();
	
	        try {
	            int no = 1;
	
	            for (Whiskey whiskey : whiskeys) {
	                if (whiskey != null && whiskey.getNo() == no) {                   
	                   updateWhiskeyInfo(whiskey);
	                   input =  sc.next();
	                    
	                }
	                no++;
	            }
	            for (Whiskey whiskey : whiskeys) {
	                if (whiskey != null && whiskey.getName() != null && whiskey.getName().equals(input)) {                	
	                	updateWhiskeyInfo(whiskey);
	                	
	                    
	                }
	            }
	        } catch (Exception e) {  e.printStackTrace(); }
	           
	        
	
	        System.out.println("해당 이름 또는 번호의 위스키를 찾을 수 없습니다.");
	    }
    }

    private void updateWhiskeyInfo(Whiskey whiskey) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("새로운 맛 (쉼표로 구분) > ");
        String input = sc.nextLine();
        String[] arr = input.split(",");
        List<String> newFlavors = new ArrayList<>();
        for (String flavor : arr) {
            newFlavors.add(flavor);
        }
        whiskey.setFlavors(newFlavors);
        System.out.println("위스키 정보가 수정되었습니다.");
    }

    
    @Override
    public void exec(ArrayList<Whiskey> users, UserView_crud crud) {
        int row = crud.table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "수정할 위스키를 선택하세요.");
            return;
        }

        String name = JOptionPane.showInputDialog("새로운 이름 입력");
        String flavors = JOptionPane.showInputDialog("새로운 향 입력 (쉼표로 구분)");

        if (name != null && !name.isEmpty()) {
            users.set(row, new Whiskey(name, users.get(row).getFlavors()));
            crud.model.setValueAt(name, row, 1); 
        }

        if (flavors != null && !flavors.isEmpty()) {
            List<String> newFlavors = new ArrayList<>(Arrays.asList(flavors.split(",")));
            users.set(row, new Whiskey(users.get(row).getName(), newFlavors));
            crud.model.setValueAt(flavors, row, 2); 
        }
    }
}