package Portfolio2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class UserCreate implements UserProcess {
    @Override
    public void exec(ArrayList<Whiskey> whiskeys) {
        System.out.println("..........1. create");
        Scanner sc = new Scanner(System.in);
        System.out.print("위스키 이름 > ");
        String name = sc.nextLine();
        System.out.print("맛 (쉼표로 구분) > ");
        String[] flavors = sc.nextLine().split(",");

        List<String> flavorList = new ArrayList<>();
        for (String flavor : flavors) {
            flavorList.add(flavor);
        }

        whiskeys.add(new Whiskey(name, flavorList));
        System.out.println("위스키가 추가되었습니다.");
    }

	@Override
	public void exec(ArrayList<Whiskey> users, UserView_crud crud) {
		String name = JOptionPane.showInputDialog("이름을 입력해주세요> ");
		String flavors = JOptionPane.showInputDialog("향을 입력해주세요> ");
		
		users.add(  new Whiskey( name , flavors) );
		
		
		Object[] data = {Whiskey.num,  name, flavors}; 
		crud.model.addRow(data);
		
	}
}