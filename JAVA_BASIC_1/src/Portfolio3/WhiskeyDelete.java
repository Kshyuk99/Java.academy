package Portfolio3;

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
        Iterator<Whiskey> iter = users.iterator();
        while (iter.hasNext()) {
            Whiskey whiskey = iter.next();
            if (whiskey.getNo() == no) {
                iter.remove();              
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