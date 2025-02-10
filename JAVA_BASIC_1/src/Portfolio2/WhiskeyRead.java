package Portfolio2;

import java.util.ArrayList;
import java.util.Iterator;

class WhiskeyRead implements WhiskeyProcess {
    @Override
    public void exec(ArrayList<Whiskey> users) {
        System.out.println("..........2. read");
        Iterator<Whiskey> iter = users.iterator();
        while (iter.hasNext()) {
            Whiskey u = iter.next();
            System.out.println(u.getNo() + "\t" + u.getName() + "\t" + u.getFlavors());
        }
    }

    @Override
    public void exec(ArrayList<Whiskey> users, UserView_crud crud) {

    }
}