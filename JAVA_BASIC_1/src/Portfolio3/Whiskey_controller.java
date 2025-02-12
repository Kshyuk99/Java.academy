package Portfolio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Whiskey_controller {

    private final static int create = 1;
    private final static int read = 2;
    private final static int update = 3;
    private final static int delete = 4;
    private final static int exit = 5;

    private static String Menu = "\nmenu - 1.create 2.read 3.update 4.delete 5.exit \n입력>";
    private static String Error = "잘못된 입력입니다. 다시 입력해주세요.";

    public static void main(String[] args) {
        ArrayList<Whiskey> list = new ArrayList<>(); //Whiskey 객체를 저장하는 ArrayList 생성

        Scanner sc = new Scanner(System.in);
        int num = -1; //메뉴 선택 변수 초기화

        while (true) {
            System.out.print(Menu);

            num = sc.nextInt();
            sc.nextLine();

            if (num == exit) {
                System.out.println("프로그램종료");
                break;
            }

            WhiskeyProcess controller = null;

            switch (num) {
                case create:
                    controller = new WhiskeyCreate();
                    break;
                case read:
                    controller = new WhiskeyRead();
                    break;
                case update:
                    controller = new WhiskeyUpdate();
                    break;
                case delete:
                    controller = new WhiskeyDelete();
                    break;
                default:
                    System.out.println(Error);
                    break;
            }            

        }
    }
}