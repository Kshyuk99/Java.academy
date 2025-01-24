package Portfolio;
import java.util.Scanner;
public class Whisky_ {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Whisky 추천을 시작합니다.");
		System.out.println("성향에 따라 다른 Whiskey를 추천해드립니다.");
		System.out.println("성향을 선택하세요(1-17): ");
		
		int choice = in.nextInt();
		in.nextLine();
		
		String[] recommendations = {
				"스모크향, 곡물향 Whiskey, 예를 를면 Johnnie walker Black Label",
				"풍부한 Whiskey, 예를 들면 Glenfiddich 18 Year O1d",
				"진한 Whiskey, 예를 들면 Lagavulin 16 Year Old",
				"바닐라향, 과실향 Whiskey, 예를 들면 chivasrigal 18 Year O1d",
				"바닐라향, 계피향 Whiskey, 예를 를면 Maker's Mark",
				"꿀향, 꽃향 Whiskey, 예를 를면 Valentine12",
				"계피향, 곡물향, 카라멜향 Whiskey, 예를 들면 Buffalo Trace",
				"곡몰항, 카라멜향, 민트향 Whiskey, 예를 들면 Wild Turkey",
				"피트향(석탄 소금 해조류), 과실향, 스모크향, 아세톤향 Whiskey, 예를 들면 Lagavuln 16 Year O1d",
				"피트향(석탄 소금 해조류), 스모크향, 초콜릿향 Whiskey, 예를 들면 Ardbeg 10 year Old",
				"피트향(석탄 소금 해조류), 소금항, 스으크램, 아세톤향 Whiskey, 예름 을면 Laphroaig 16 Year O1d",
				"과실향, 건과일향, 스파이시향 Whiskey, 예름 블면 Macallan 12 Year O1d",
				"스파이시향, 건포도향, 바닐라향 Whiskey, 예를 블면 Glendronach 12 Year O1d",
				"스파이시향, 초콜릿향, 건과일향 Whiskey, 예를 들면 G1engoyne 12 Year Old",
				"과실향, 바닐라향 Whiskey, 예를 들면 Glenmorangie original",
				"과실향, 스파이시향, 꿀향 Whiskey, 예를 들면 Glenfidddich 12 Year Old",
				"과실향, 스파이시향, 바닐라향 Whiskey, 예클 를면 Glenlivet 12 Year O1d"
		};
		if (choice >= 1 && choice <= recommendations.length) {
			System.out.println("추천하는 Whiskey는 " + recommendations[choice - 1] + " 입니다.");
		} else {
			System.out.println("죄송합니다. 해당 성향의 Whiskey 추천을 찾을 수 없습니다.");
		}
		in.close();
		
	}

}
