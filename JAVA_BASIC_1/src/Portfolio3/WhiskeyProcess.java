package Portfolio3;

import java.util.ArrayList;



public interface WhiskeyProcess {
    void exec( ArrayList<Whiskey> whiskeys );
	void exec(ArrayList<Whiskey> users, UserView_crud crud);
	void exec( UserView_crud crud);
	
}