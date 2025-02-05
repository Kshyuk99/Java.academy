package Portfolio2;


import java.util.ArrayList;
import java.util.Iterator;

public class UserRead implements UserProcess {
    

    public void exec(ArrayList<Whiskey> whiskeys) { 
        System.out.println("..........2. read");
        if (whiskeys.isEmpty()) {
            System.out.println("등록된 위스키가 없습니다.");
            return;
        }
        Iterator<Whiskey> iter = whiskeys.iterator();
        while (iter.hasNext()) {
            Whiskey whiskey = iter.next();
            System.out.println(whiskey.getName() + "\t" + whiskey.getFlavors()); 
        }
    }
}