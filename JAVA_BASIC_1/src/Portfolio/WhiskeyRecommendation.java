package Portfolio;
import java.util.Random;
import java.util.Scanner;

public class WhiskeyRecommendation {
	

    private String[] flavors = {
        "부드러운", "풍부한", "진한", "달콤한", "바닐라향", "흙향", "과일향", "꽃향", "나무향", "스파이시",
        "계피향", "곡물향", "피트향(석탄 소금 해조류)", "과실향", "스모크향", "아세톤향", "초콜릿향", "소금향",
        "건과일향"
    };

    private String[][] whiskeyRecommendations = {
    	{"Johnnie walker Black Label"},
        {"Glenfiddich 18 Year Old", "Jameson Irish Whiskey", "Glenlivet 12 Year Old"}, 
        {"Macallan Sherry Oak 12 Year Old", "Highland Park 18 Year Old"}, 
        {"Lagavulin 16 Year Old", "Talisker 10 Year Old"}, 
        {"Maker's Mark", "Chivasrigal 18 Year Old"}, 
        {"Maker's Mark", "Chivasrigal 18 Year Old"},
        {"Valentine12"},
        {"Buffalo Trace"},
        {"Wild Turkey"},
        {"Ardbeg 10 year Old"},
        {"Laphroaig 16 Year O1d"},
        {"Lagavulin 16 Year Old"}, 
        {"Glenfiddich 18 Year Old", "Macallan 12 Year Old"}, 
        {"Ardbeg 10 year Old"},
        {"Glenfiddich 18 Year Old"}, 
        {"Talisker 10 Year Old"}, 
        {"Glenmorangie original"},
        {"Glendronach 12 Year O1d"},
        {"Glenlivet 12 Year O1d"}
    };

    public String recommendWhiskey(String selectedFlavor) {
        int flavorIndex = -1;
        for (int i = 0; i < flavors.length; i++) {
            if (flavors[i].equals(selectedFlavor)) {
                flavorIndex = i;
                break;
            }
        }

        if (flavorIndex == -1) {
            return "죄송합니다. 해당 성향의 Whiskey 추천을 찾을 수 없습니다.";
        }

        String[] whiskeys = whiskeyRecommendations[flavorIndex];
        Random random = new Random();
        int randomIndex = random.nextInt(whiskeys.length);
        String recommendation = whiskeys[randomIndex];

        return "추천하는 " + selectedFlavor + " 위스키는 " + recommendation + " 입니다.";
    }

    public static void main(String[] args) {
        WhiskeyRecommendation whiskeyRecommender = new WhiskeyRecommendation();
        Scanner sc = new Scanner(System.in);

        System.out.println("어떤 맛의 위스키를 찾으시나요?");
        System.out.println("다음 중에서 선택해주세요:");        
		
		
        for (String flavor : whiskeyRecommender.flavors) {
            System.out.print(flavor + " ");
            
        }
        System.out.println();

        String selectedFlavor = sc.nextLine();

        String recommendation = whiskeyRecommender.recommendWhiskey(selectedFlavor);
        System.out.println(recommendation);

        sc.close();
    }
}