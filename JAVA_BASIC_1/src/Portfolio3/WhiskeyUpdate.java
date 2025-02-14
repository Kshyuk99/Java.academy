package Portfolio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class WhiskeyUpdate implements WhiskeyProcess {
    @Override
    public void exec(ArrayList<Whiskey> whiskeys) {

    }

    @Override
    public void exec(ArrayList<Whiskey> users, UserView_crud crud) {
        try {
            int no = Integer.parseInt(JOptionPane.showInputDialog("수정할 위스키 번호를 입력하세요"));//#

            Whiskey whiskey = crud.findWhiskeyByNo(no);
            if (whiskey == null) {
                JOptionPane.showMessageDialog(null, "해당 번호의 위스키가 존재하지 않습니다.");
                return;
            }
            
            String newName = JOptionPane.showInputDialog("새로운 이름 입력");
            String newFlavors = JOptionPane.showInputDialog("새로운 향 입력 (쉼표로 구분)");

            if (newName != null && !newName.isEmpty()) { // 이름 업데이트
                whiskey.setName(newName);
            }

            if (newFlavors != null && !newFlavors.isEmpty()) { // 향 업데이트부분
                List<String> newFlavorList = new ArrayList<>(Arrays.asList(newFlavors.split(",")));
                whiskey.setFlavors(newFlavorList);
            }

            for (int i = 0; i < crud.model.getRowCount(); i++) {
                if ((int) crud.model.getValueAt(i, 1) == no) {//테이블모델 i번째행, 첫번째 위스키번호가 수정할 번호랑 일치하는지 확인
                    crud.model.setValueAt(newName, i, 2); //  이름 업데이트 부분
                    crud.model.setValueAt(newFlavors, i, 3); //  향 업데이트
                    break;
                }
            }

            crud.refreshTable();  
            JOptionPane.showMessageDialog(null, "위스키 정보가 수정되었습니다.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "잘못된 입력입니다. 숫자를 입력해주세요.");
        }
    }

	@Override
	public void exec(UserView_crud crud) {
		// TODO Auto-generated method stub
		
	}
}