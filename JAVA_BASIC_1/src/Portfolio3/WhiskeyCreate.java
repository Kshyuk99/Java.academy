package Portfolio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner; // Scanner 클래스 import

import javax.swing.JOptionPane;

public class WhiskeyCreate implements WhiskeyProcess {
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

        Whiskey whiskey = new Whiskey(name, flavorList, "RED");
        whiskeys.add(whiskey);

        System.out.println("위스키가 추가되었습니다.");
    }

    @Override
    public void exec(ArrayList<Whiskey> users, UserView_crud crud) {

        int type = Integer.parseInt(JOptionPane.showInputDialog("type 1=RED , 2=WHITE> "));
        String name = JOptionPane.showInputDialog("이름을 입력해주세요> ");
        String flavors = JOptionPane.showInputDialog("향을 입력해주세요> ");

        Whiskey whiskey = new Whiskey(name, new ArrayList<>(Arrays.asList(flavors.split(","))), (type==1? "RED" : "WHITE"));
        users.add(whiskey);
        crud.whiskeys.add(whiskey);

        Object[] data = {
            Whiskey.num, whiskey.getNo(), name, flavors // GUI부분 행 데이터 포함하는 부분
        };
        crud.model.addRow(data);
    }
}