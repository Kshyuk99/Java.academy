package Portfolio2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class UserView_crud {

    JFrame frame;
    JScrollPane scroll;
    JTable table;
    String[] column;
    Object[][] rowData;
    DefaultTableModel model;
    JPanel panel;
    JButton[] button;
    ArrayList<Whiskey> whiskeys;

    public UserView_crud() {
        frame = new JFrame("WhiskeyRecommendation");

        panel = new JPanel();
        button = new JButton[] {
            new JButton("등록"),
            new JButton("수정"),
            new JButton("삭제"),
            new JButton("종료")
        };

        column = new String[] {
            "NUM",
            "NO",
            "NAME",
            "FLAVORS"
        };
        
        rowData = new Object[][] {};
        model = new DefaultTableModel(rowData, column);
        table = new JTable(model);
        scroll = new JScrollPane(table);
        for (int i = 0; i < button.length; i++) {
            button[i].setBackground(Color.GRAY);
            button[i].setForeground(Color.white);
            button[i].setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 15));
        }

        table.setBackground(new Color(200, 200, 200));
        table.setRowHeight(30);

        table.getTableHeader().setReorderingAllowed(false);

        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumn(column[i]).setCellRenderer(dtcr);
        }

        whiskeys = new ArrayList<>();

        String[] name = {
            "Johnnie Walker Black Label", "Glenfiddich 18 Year Old", "Lagavulin 16 Year Old",
            "Chivas Regal 18 Year Old", "Maker's Mark", "Valentine 12", "Buffalo Trace",
            "Wild Turkey", "Lagavulin 16 Year Old", "Ardbeg 10 Year Old", "Laphroaig 16 Year Old",
            "Macallan 12 Year Old", "Glendronach 12 Year Old", "Glengoyne 12 Year Old",
            "Glenmorangie Original", "Glenfiddich 12 Year Old", "Glenlivet 12 Year Old"
        };

        String[][] flavors = {
            {"스모크향", "곡물향"}, {"풍부한"}, {"진한"}, {"바닐라향", "과실향"}, {"바닐라향", "계피향"},
            {"꿀향", "꽃향"}, {"계피향", "곡물향", "카라멜향"}, {"곡물향", "카라멜향", "민트향"},
            {"피트향(석탄 소금 해조류)", "과실향", "스모크향", "아세톤향"}, {"피트향(석탄 소금 해조류)", "스모크향", "초콜릿향"},
            {"피트향(석탄 소금 해조류)", "소금향", "스크램향", "아세톤향"}, {"과실향", "건과일향", "스파이시향"},
            {"스파이시향", "건포도향", "바닐라향"}, {"스파이시향", "초콜릿향", "건과일향"},
            {"과실향", "바닐라향"}, {"과실향", "스파이시향", "꿀향"}, {"과실향", "스파이시향", "바닐라향"}
        };

        for (int i = 0; i < name.length; i++) {
            List<String> flavorList = new ArrayList<>();
            for (int j = 0; j < flavors[i].length; j++) {
                flavorList.add(flavors[i][j]);
            }
            Whiskey whiskey = new Whiskey(name[i], flavorList);
            whiskeys.add(whiskey);

            Object[] data = {
                Whiskey.num, whiskey.getNo(), name[i], flavorList.toString()
            };
            model.addRow(data);
        }
    }
    

    void show() {
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        frame.add(scroll, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);
        for (int i = 0; i < button.length; i++) {
            panel.add(button[i]);
        }
        frame.setSize(900, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addRow(Object[] data) {
        model.addRow(data);
    }

    public Whiskey findWhiskeyByNo(int no) {
        for (Whiskey whiskey : whiskeys) {
            if (whiskey.getNo() == no) {
                return whiskey;
            }
        }
        return null;
    }

    public void refreshTable() {  //table 새로고침
        model.fireTableDataChanged();
    }

    public static void main(String[] args) {
        new UserView_crud().show();
    }
}