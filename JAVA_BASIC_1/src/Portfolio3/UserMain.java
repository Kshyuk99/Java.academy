package Portfolio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class UserMain {

    ArrayList<Whiskey> users;
    ArrayList<Whiskey> admin;

    UserView_Intro intro;
    UserView_crud crud;
    UserView_type type;
    // 관리자 crud만들기
   

    WhiskeyProcess controller;
    WhiskeyProcess[] process; //WhiskeyProcess 배열 초기화

    public UserMain() {
        users = new ArrayList<Whiskey>();
        intro = new UserView_Intro();
        intro.show();        
        crud = new UserView_crud();
        
        process = new WhiskeyProcess[] {
            new WhiskeyCreate(),
            new WhiskeyRead(),
            new WhiskeyUpdate(),
            new WhiskeyDelete()
        };
    }

    public void intro() {
        intro.btns[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                intro.frame.dispose();
                crud.show();
                member();
            }

        });
    }

    public void member() {
        crud.button[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller = process[0];
                controller.exec(users, crud);
            }
        });
        crud.button[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller = process[2];
                controller.exec(users, crud);
            }
        });
        crud.button[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller = process[3];
                controller.exec(users, crud);
            }
        });

        crud.button[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crud.frame.dispose();
            }
        });        
    }
    

    public static void main(String[] args) {
        new UserMain().intro();

    }

}