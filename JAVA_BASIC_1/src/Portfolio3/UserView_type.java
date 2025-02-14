package Portfolio3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UserView_type {

    JFrame frame;
    JLabel label1;
    JButton[] button;
    JLabel label2;
    JTable whiskeyTable;
    DefaultTableModel whiskeyTableModel;
    JScrollPane whiskeyScrollPane;
    JButton red;
    JButton white;
    JButton exit;
    private String select = null;

    String[] name = {
        "Johnnie Walker Black Label", "Glenfiddich 18 Year Old", "Lagavulin 16 Year Old",
        "Chivas Regal 18 Year Old", "Maker's Mark", "Valentine 12", "Buffalo Trace",
        "Wild Turkey", "Lagavulin 16 Year Old", "Ardbeg 10 Year Old", "Laphroaig 16 Year Old",
        "Macallan 12 Year Old", "Glendronach 12 Year Old", "Glengoyne 12 Year Old",
        "Glenmorangie Original", "Glenfiddich 12 Year Old", "Glenlivet 12 Year Old"
    };

    String[] type = {
        "RED", "WHITE", "RED", "WHITE", "RED",
        "RED", "RED", "WHITE", "RED", "RED",
        "RED", "RED", "RED", "RED", "WHITE",
        "RED", "WHITE"
    };

    public UserView_type() {
        frame = new JFrame("RecommendPage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setResizable(false);

        label1 = new JLabel();
        label2 = new JLabel();

        button = new JButton[]{
            new JButton("취향확인"),
            new JButton("추천받기")
        };

        for (int i = 0; i < button.length; i++) {
            button[i].setBackground(Color.GRAY);
            button[i].setForeground(Color.white);
            button[i].setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 15));
        }

        exit = new JButton("종료");
        exit.setBackground(Color.GRAY);
        exit.setForeground(Color.white);
        exit.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 15));
        exit.addActionListener(e -> { System.exit(0); });

        button[0].addActionListener(e -> {
        	red = new JButton("RED");
        	white = new JButton("WHITE");
            JPanel typePanel = new JPanel(new FlowLayout());
            typePanel.add(red);
            typePanel.add(white);
            frame.add(typePanel, BorderLayout.NORTH);
            frame.setVisible(true);

            red.addActionListener(e1 -> {
                System.out.println("RED 선택");
                select = "RED";
                if (whiskeyTableModel != null) {
                    wfl(); // 색깔에 따라 목록필터링 
                } else { show1(); wfl(); }
            });
            white.addActionListener(e2 -> {
                System.out.println("WHITE 선택");
                select = "WHITE";
                if (whiskeyTableModel != null) {
                    wfl();
                } else { show1(); wfl(); }
            });
        });

        button[1].addActionListener(e -> { show1(); });

    }

    private void wfl() {
        if (select == null) { return; }

        List<String> filter = new ArrayList<>();
        for (int i = 0; i < name.length; i++) {
            if (type[i].equals(select)) {
                filter.add(name[i]);
            }
        }

        if (whiskeyTableModel != null) {
            whiskeyTableModel.setRowCount(0);
            for (String Name : filter) {
                whiskeyTableModel.addRow(new Object[]{Name});
            }
        }
    }

    private void show1() {
        List<String> list = new ArrayList<>(Arrays.asList(name));

        whiskeyTableModel = new DefaultTableModel(new Object[]{"위스키 이름"}, 0);
        whiskeyTable = new JTable(whiskeyTableModel);
        for (String Name : list) {
            whiskeyTableModel.addRow(new Object[]{Name});
        }

        whiskeyScrollPane = new JScrollPane(whiskeyTable);

        frame.add(whiskeyScrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public void show() {
        frame.setLayout(new BorderLayout());

        JPanel button3= new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 20));
        button3.add(button[0]);
        button3.add(button[1]);
        button3.add(exit);

        frame.add(label1, BorderLayout.NORTH);
        frame.add(label2, BorderLayout.NORTH);
        frame.add(button3, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public static void main(String[] args) { new UserView_type().show(); }
}