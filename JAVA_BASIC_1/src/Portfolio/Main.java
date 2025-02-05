package Portfolio;


import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WhiskeyRecommendation3 whiskeyRecommender = new WhiskeyRecommendation3();

        whiskeyRecommender.addWhiskey(new Whiskey("Johnnie Walker Black Label", "스모크향", "곡물향"));
        whiskeyRecommender.addWhiskey(new Whiskey("Glenfiddich 18 Year Old", "풍부한"));
        whiskeyRecommender.addWhiskey(new Whiskey("Lagavulin 16 Year Old", "진한"));
        whiskeyRecommender.addWhiskey(new Whiskey("Chivas Regal 18 Year Old", "바닐라향", "과실향"));
        whiskeyRecommender.addWhiskey(new Whiskey("Maker's Mark", "바닐라향", "계피향"));
        whiskeyRecommender.addWhiskey(new Whiskey("Valentine 12", "꿀향", "꽃향"));
        whiskeyRecommender.addWhiskey(new Whiskey("Buffalo Trace", "계피향", "곡물향", "카라멜향"));
        whiskeyRecommender.addWhiskey(new Whiskey("Wild Turkey", "곡물향", "카라멜향", "민트향"));
        whiskeyRecommender.addWhiskey(new Whiskey("Lagavulin 16 Year Old", "피트향(석탄 소금 해조류)", "과실향", "스모크향", "아세톤향"));
        whiskeyRecommender.addWhiskey(new Whiskey("Ardbeg 10 Year Old", "피트향(석탄 소금 해조류)", "스모크향", "초콜릿향"));
        whiskeyRecommender.addWhiskey(new Whiskey("Laphroaig 16 Year Old", "피트향(석탄 소금 해조류)", "소금향", "스크램향", "아세톤향"));
        whiskeyRecommender.addWhiskey(new Whiskey("Macallan 12 Year Old", "과실향", "건과일향", "스파이시향"));
        whiskeyRecommender.addWhiskey(new Whiskey("Glendronach 12 Year Old", "스파이시향", "건포도향", "바닐라향"));
        whiskeyRecommender.addWhiskey(new Whiskey("Glengoyne 12 Year Old", "스파이시향", "초콜릿향", "건과일향"));
        whiskeyRecommender.addWhiskey(new Whiskey("Glenmorangie Original", "과실향", "바닐라향"));
        whiskeyRecommender.addWhiskey(new Whiskey("Glenfiddich 12 Year Old", "과실향", "스파이시향", "꿀향"));
        whiskeyRecommender.addWhiskey(new Whiskey("Glenlivet 12 Year Old", "과실향", "스파이시향", "바닐라향"));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n위스키 추천 시스템");
            System.out.println("1. 위스키 추가");
            System.out.println("2. 위스키 조회 (전체)");
            System.out.println("3. 위스키 조회 (이름)");
            System.out.println("4. 위스키 정보 수정");
            System.out.println("5. 위스키 삭제");
            System.out.println("6. 위스키 추천");
            System.out.println("7. 종료");
            System.out.print("선택: ");

            int choice = -1;
            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                sc.nextLine();
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("위스키 추가");
                    System.out.print("위스키 이름: ");
                    String name = sc.nextLine();
                    System.out.print("맛 (쉼표로 구분): ");
                    String[] flavors = sc.nextLine().split(",");
                    whiskeyRecommender.addWhiskey(new Whiskey(name, flavors));
                    break;
                case 2:
                    System.out.println("전체 위스키 목록 조회");
                    for (Whiskey w : whiskeyRecommender.getAllWhiskeys()) {
                        System.out.println(w);
                    }
                    break;
                case 3:
                    System.out.println("이름으로 위스키 조회");
                    System.out.print("위스키 이름: ");
                    name = sc.nextLine();
                    Whiskey whiskey = whiskeyRecommender.getWhiskeyByName(name);
                    if (whiskey != null) {
                        System.out.println(whiskey);
                    } else {
                        System.out.println("해당 위스키를 찾을 수 없습니다.");
                    }
                    break;
                case 4:
                    System.out.println("위스키 정보 수정");
                    System.out.print("수정할 위스키 이름: ");
                    name = sc.nextLine();
                    System.out.print("새로운 맛 (쉼표로 구분): ");
                    flavors = sc.nextLine().split(",");
                    whiskeyRecommender.updateWhiskey(name, flavors);
                    break;
                case 5:
                    System.out.println("위스키 삭제");
                    System.out.print("삭제할 위스키 이름: ");
                    name = sc.nextLine();
                    whiskeyRecommender.deleteWhiskey(name);
                    break;
            }
        }
    }
}