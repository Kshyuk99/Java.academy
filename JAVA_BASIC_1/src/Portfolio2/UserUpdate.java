package Portfolio2;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;
import com.company.Portfolio.UserView_crud;

public class UserUpdate implements UserProcess {
    @Override
    public void exec(ArrayList<Whiskey> whiskeys) {
        System.out.println("..........3. update");
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 위스키 이름 또는 번호 > ");
        String input = sc.nextLine();

        try {
            int no = Integer.parseInt(input); 

            for (Whiskey whiskey : whiskeys) {
                if (whiskey != null && whiskey.getNo() == no) { 
                    updateWhiskeyInfo(whiskey, sc);
                    return;
                }
            }
        } catch (NumberFormatException e) { 
            for (Whiskey whiskey : whiskeys) {
                if (whiskey != null && whiskey.getName() != null && whiskey.getName().equals(input)) {
                    updateWhiskeyInfo(whiskey, sc);
                    return;
                }
            }
        }

        System.out.println("해당 이름 또는 번호의 위스키를 찾을 수 없습니다.");
    }

    private void updateWhiskeyInfo(Whiskey whiskey, Scanner sc) {
        System.out.print("새로운 맛 (쉼표로 구분) > ");
        String input = sc.nextLine();
        String[] arr = input.split(",");
        List<String> newFlavors = new ArrayList<>();
        for (String flavor : arr) {
            newFlavors.add(flavor);
        }
        whiskey.setFlavors(new List<>(newFlavors));
        System.out.println("위스키 정보가 수정되었습니다.");
    }

	@Override
	public void exec(ArrayList<Whiskey> users, Portfolio2.UserView_crud crud) {
		
				String name = JOptionPane.showInputDialog("수정할 위스키 입력");
				String flavors = JOptionPane.showInputDialog("수정할 향 입력");
				
				int find = -1;  int cnt=0;
				Iterator<Whiskey> iter = users.iterator(); 
				while(iter.hasNext()) { 		
					if(iter.next().getNo() == no) { find=cnt;  break; } 
					cnt++;  
				}
				if(find==-1) {JOptionPane.showMessageDialog(null, "번호를 입력"); return;}
				
				users.get(cnt).setNum(num);
				
				
				crud.model.setValueAt(name, 2, 4); // 어떤값을, 몇번째줄, 몇번째칸
		
	}

    
}