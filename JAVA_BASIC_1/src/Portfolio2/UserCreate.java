package Portfolio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserCreate implements UserProcess {
	
	@Override
    public void exec(ArrayList<Whiskey> whiskeys) {  
        System.out.println("..........1. create");
        Scanner sc = new Scanner(System.in);
        System.out.print("위스키 이름 > ");
        String name = sc.nextLine(); 
        System.out.print("맛 (쉼표로 구분) > ");
        String Input = sc.nextLine();
        String[] Arr = Input.split(",");

        List<String> flavors = new ArrayList<>();
        for (String flavor : Arr) {
            flavors.add(flavor); 
        }

        Whiskey w = new Whiskey(name, flavors); 
        whiskeys.add(w); 

        System.out.println("위스키가 추가되었습니다.");
    }    
}