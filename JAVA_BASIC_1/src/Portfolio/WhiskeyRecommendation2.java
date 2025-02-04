package Portfolio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Whiskey {
    public static int num=0;
    private int no;  //## 기본키 ( 구분자 )
    private String name;
    private List<String> flavors;

    public Whiskey() {}

    // ## 관리자 위스키등록 
    public Whiskey(String name, String[] flavors2) {
        this.no = ++num;
        this.name = name;        
        this.flavors = new ArrayList<>();
        for (String flavor : flavors2) {
            this.flavors.add(flavor);
        }
    }
    
   public Whiskey(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

public Whiskey(String string, String string2) {
	// TODO Auto-generated constructor stub
}

public Whiskey(String string, String string2, String string3, String string4) {
	// TODO Auto-generated constructor stub
}

public Whiskey(String string, String string2, String string3, String string4, String string5) {
	// TODO Auto-generated constructor stub
}

// ## setter 추가



    

	@Override public String toString() { return "Name: " + name + ", Flavors: " + flavors; }

	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		Whiskey.num = num;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getFlavors() {
		return flavors;
	}

	public void setFlavors(List<String> flavors) {
		this.flavors = flavors;
	}
}


public class WhiskeyRecommendation2 {
    //// 0 
    private List<Whiskey> whiskeys = new ArrayList<>();

    //// 1  create
    public void addWhiskey(Whiskey whiskey) {
        whiskeys.add(whiskey);
    }
    //// 2-1 read : 전체위스키확인 
    public List<Whiskey> getAllWhiskeys() {
        return whiskeys;
    }
    
    //// 2-2 read : detail
    public Whiskey getWhiskeyByName(String name) {
        for (Whiskey whiskey : whiskeys) {
            if (whiskey.getName().equals(name)) {
                return whiskey;
            }
        }
        return null;
    }
    //// 3 update 화면보고.
    public void updateWhiskey(String name,  List<String> flavors) {
        Whiskey whiskey = getWhiskeyByName(name);
        if (whiskey != null) {
            whiskey.getFlavors().clear(); //???????
            for (String flavor : flavors) {
                whiskey.getFlavors().add(flavor);
            }
        }
    }
    
    public void deleteWhiskey(String name) {
        whiskeys.removeIf(whiskey -> whiskey.getName().equals(name));
    }
    public List<String> recommendWhiskey(String selectedFlavor) {
        List<Whiskey> filteredWhiskeys = new ArrayList<>();
        for (Whiskey whiskey : whiskeys) {
            if (whiskey.getFlavors().contains(selectedFlavor)) {
                filteredWhiskeys.add(whiskey);
            }
        }
        List<String> recommendedWhiskeys = new ArrayList<>();
        Random random = new Random();
        if (filteredWhiskeys.isEmpty()) {
            return List.of("해당 맛의 위스키가 없습니다.");
        }
        for (int i = 0; i < 3 && !filteredWhiskeys.isEmpty(); i++) {
            int randomIndex = random.nextInt(filteredWhiskeys.size());
            recommendedWhiskeys.add(filteredWhiskeys.get(randomIndex).getName());
            filteredWhiskeys.remove(randomIndex);
        }
        return recommendedWhiskeys;
    }
    public static void main(String[] args) {
        WhiskeyRecommendation2 whiskeyRecommender = new WhiskeyRecommendation2();
        
        List<Whiskey> whiskeyList = Arrays.asList(new Whiskey("Johnnie Walker Black Label", "스모크향", "곡물향"),
        										new Whiskey("Glenfiddich 18 Year Old", "풍부한"),
        										new Whiskey("Lagavulin 16 Year Old", "진한"),
        										new Whiskey("Chivas Regal 18 Year Old", "바닐라향", "과실향"),
        										new Whiskey("Maker's Mark", "바닐라향", "계피향"),
        										new Whiskey("Valentine 12", "꿀향", "꽃향"),
        										new Whiskey("Buffalo Trace", "계피향", "곡물향", "카라멜향"),
        										new Whiskey("Lagavulin 16 Year Old", "피트향(석탄 소금 해조류)", "과실향", "스모크향", "아세톤향"),
        										new Whiskey("Ardbeg 10 Year Old", "피트향(석탄 소금 해조류)", "스모크향", "초콜릿향"),
        										new Whiskey("Laphroaig 16 Year Old", "피트향(석탄 소금 해조류)", "소금향", "스크램향", "아세톤향"),
        										new Whiskey("Macallan 12 Year Old", "과실향", "건과일향", "스파이시향"),
        										new Whiskey("Glendronach 12 Year Old", "스파이시향", "건포도향", "바닐라향"),
        										new Whiskey("Glengoyne 12 Year Old", "스파이시향", "초콜릿향", "건과일향"),
        										new Whiskey("Glenmorangie Original", "과실향", "바닐라향"),
        										new Whiskey("Glenfiddich 12 Year Old", "과실향", "스파이시향", "꿀향"),
        										new Whiskey("Glenlivet 12 Year Old", "과실향", "스파이시향", "바닐라향") );               										
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
                    whiskeyRecommender.updateWhiskey(new Whiskey(name, flavors));
                    break;
                case 5:
                    System.out.println("위스키 삭제");
                    System.out.print("삭제할 위스키 이름: ");
                    name = sc.nextLine();
                    whiskeyRecommender.deleteWhiskey(name);
                    break;
                case 6:
                    System.out.println("위스키 추천");
                    System.out.print("찾는 맛: ");
                    String selectedFlavor = sc.nextLine(); 
                    List<String> recommendedWhiskeys = whiskeyRecommender.recommendWhiskey(selectedFlavor);
                    recommendedWhiskeys.forEach(System.out::println);
                    break;
                case 7:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
                    break;
            }
        }
    }
	private void updateWhiskey(Whiskey whiskey) {
		// TODO Auto-generated method stub
		
	}
	
}
