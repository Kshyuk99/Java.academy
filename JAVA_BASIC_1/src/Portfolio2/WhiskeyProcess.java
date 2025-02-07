package Portfolio2;

import java.util.ArrayList;

public interface WhiskeyProcess {
    void exec( ArrayList<Whiskey> whiskeys );
	void exec(ArrayList<Whiskey> users, UserView_crud crud);
}