package Portfolio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class UserDelete implements UserProcess {
    @Override
    public void exec(ArrayList<Whiskey> whiskeys) {
        System.out.println("..........4. delete");
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 위스키 이름 또는 번호 > ");
        String input = sc.nextLine();

        try {
            int no = Integer.parseInt(input); 

            Iterator<Whiskey> iter = whiskeys.iterator();
            while (iter.hasNext()) {
                Whiskey whiskey = iter.next();
                if (whiskey != null && whiskey.getNo() == no) { 
                    iter.remove();
                    System.out.println("위스키가 삭제되었습니다.");
                    return;
                }
            }
        } catch (NumberFormatException e) { 
            Iterator<Whiskey> iter = whiskeys.iterator();
            while (iter.hasNext()) {
                Whiskey whiskey = iter.next();
                if (whiskey != null && whiskey.getName() != null && whiskey.getName().equals(input)) {
                    iter.remove();
                    System.out.println("위스키가 삭제되었습니다.");
                    return;
                }
            }
        }

        System.out.println("해당 이름 또는 번호의 위스키를 찾을 수 없습니다.");
    }

	@Override
	public void exec(ArrayList<Whiskey> users, UserView_crud crud) {
		int no = Integer.parseInt(JOptionPane.showInputDialog("삭제할 번호 입력"));		
		
		
		int find = -1;  int cnt=0;
		Iterator<Whiskey> iter = users.iterator(); 
		while(iter.hasNext()) { 		
			if(iter.next().getNo() == no) { find=cnt; iter.remove();  break; } 
			cnt++;  
		}
		if(find==-1) {JOptionPane.showMessageDialog(null, "번호를 확인"); return;}			
		
		
		crud.model.removeRow(cnt);
		
	}
}