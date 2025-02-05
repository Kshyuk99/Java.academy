package Portfolio2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UserDelete implements UserProcess {
	

    @Override
    public void exec(ArrayList<Whiskey> whiskeys) {
        System.out.println("..........4. delete");
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 위스키 이름 > "); 
        String name = sc.nextLine();

        Iterator<Whiskey> iter = whiskeys.iterator();
        while (iter.hasNext()) {
            Whiskey whiskey = iter.next();
            if (whiskey.getName().equals(name)) { 
                iter.remove();
                System.out.println("위스키 '" + name + "'가 삭제되었습니다.");
                return; 
            }
        }

        System.out.println("해당 이름의 위스키를 찾을 수 없습니다.");
    }
}