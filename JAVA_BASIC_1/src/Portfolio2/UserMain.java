package Portfolio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class UserMain {

    ArrayList<Whiskey> users;
    ArrayList<Whiskey> admin;

    UserView_Intro intro;
    UserView_crud crud;
    // 관리자 intro는 필요없음 AdminView_Intro intro2;
    AdminView_crud crud2;

    WhiskeyProcess controller;
    WhiskeyProcess[] process;

    public UserMain() {
        users = new ArrayList<Whiskey>();
        intro = new UserView_Intro();
        intro.show();
        //intro2 = new AdminView_Intro();
        //intro2.show();
        crud = new UserView_crud();
        crud2 = new AdminView_crud();
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
        /*
        crud2.button[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller = process[0];
                controller.exec(admin, crud2);
            }
        }); */
    }
    

    public static void main(String[] args) {
        new UserMain().intro();

    }

}