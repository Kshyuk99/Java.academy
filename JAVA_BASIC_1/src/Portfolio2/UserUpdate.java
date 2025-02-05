package Portfolio2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UserUpdate implements UserProcess {
    

    @Override
    public void exec(ArrayList<Whiskey> whiskeys) {
        System.out.println("..........3. update");
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 위스키 이름 > ");
        String name = sc.nextLine();
        Iterator<Whiskey> iter = whiskeys.iterator();
        while (iter.hasNext()) {
            Whiskey whiskey = iter.next();
            if (whiskey.getName().equals(name)) {
                System.out.print("새로운 맛 (쉼표로 구분) > ");
                String input = sc.nextLine();
                String[] arr = input.split(",");
                List<String> newFlavors = new ArrayList<>();
                for (String flavor : arr) {
                    newFlavors.add(flavor);
                }
                whiskey.setFlavors(newFlavors);
                System.out.println("위스키 '" + name + "'의 맛 정보가 수정되었습니다.");
                return;
            }
        }
        System.out.println("해당 이름의 위스키를 찾을 수 없습니다.");
    }
}