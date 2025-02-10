package Portfolio2;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class WhiskeyDelete implements WhiskeyProcess {
    @Override
    public void exec(ArrayList<Whiskey> whiskeys) {
        
    }
    @Override
    public void exec(ArrayList<Whiskey> users, UserView_crud crud) {
        int no = Integer.parseInt(JOptionPane.showInputDialog("삭제할 번호를 입력하세요."));
        
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getNo() == no) {
                users.remove(i);                 
                for (int j = 0; j < crud.model.getRowCount(); j++) {
                    if ((int) crud.model.getValueAt(j, 1) == no) {
                        crud.model.removeRow(j); 
                        JOptionPane.showMessageDialog(null, "위스키가 삭제되었습니다."); 
                        return; 
                    }
                }
            }
        }       
        JOptionPane.showMessageDialog(null, "번호를 확인하세요.");
    }
}