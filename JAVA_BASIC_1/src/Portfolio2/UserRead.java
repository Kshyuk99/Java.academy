package Portfolio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import javax.swing.JOptionPane;

public class UserRead implements UserProcess {
    @Override
    public void exec(ArrayList<Whiskey> whiskeys) {
        System.out.println("..........2. read");
        if (whiskeys.isEmpty()) {
            System.out.println("등록된 위스키가 없습니다.");
            return;
        }
        for (Whiskey whiskey : whiskeys) {
            if (whiskey != null) {
                int no = whiskey.getNo();
                String name = whiskey.getName();
                List<String> flavors = whiskey.getFlavors();
                System.out.print(no + "\t");
                if (name != null) {
                    System.out.print(name + "\t");
                } else {
                    System.out.print("null\t");
                }
                if (flavors != null && !flavors.isEmpty()) {
                    System.out.println(flavors.toString());
                } else {
                    System.out.println("null");
                }
            }
        }
    }

	@Override
	public void exec(ArrayList<Whiskey> users, UserView_crud crud) {
	}
}