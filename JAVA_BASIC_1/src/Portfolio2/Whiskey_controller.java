package Portfolio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Whiskey_controller {

    private final static int create = 1;
    private final static int read = 2;
    private final static int update = 3;
    private final static int delete = 4;
    private final static int exit = 5;

    private static String Menu = "\nmenu - 1.create  2.read  3.update  4.delete  5.exit  \n입력>";
    private static String Error = "잘못된 입력입니다. 다시 입력해주세요.";

    public static void main(String[] args) {
        ArrayList<Whiskey> list = new ArrayList<>();        
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
            list.add(new Whiskey(name[i], flavorList));
        }

        Scanner sc = new Scanner(System.in);
        int num = -1;

        while (true) {
            System.out.print(Menu); 

            num = sc.nextInt();
            sc.nextLine(); 

            if (num == exit) { 
                System.out.println("프로그램종료");
                break;
            }

            UserProcess controller = null;

            switch (num) {
                case create: 
                    controller = new UserCreate();
                    break;
                case read: 
                    controller = new UserRead();
                    break;
                case update: 
                    controller = new UserUpdate();
                    break;
                case delete: 
                    controller = new UserDelete();
                    break;
                default:
                    System.out.println(Error); 
                    break;
            }

            if (controller != null) {
                controller.exec(list);
            }

        }       
    }
}