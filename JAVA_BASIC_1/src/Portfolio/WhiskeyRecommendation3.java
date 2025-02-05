package Portfolio;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WhiskeyRecommendation3 {
    private List<Whiskey> whiskeys = new ArrayList<>();

    public void addWhiskey(Whiskey whiskey) {
        whiskeys.add(whiskey);
    }

    public List<Whiskey> getAllWhiskeys() {
        return whiskeys;
    }

    public Whiskey getWhiskeyByName(String name) {
        for (Whiskey whiskey : whiskeys) {
            if (whiskey.getName().equals(name)) {
                return whiskey;
            }
        }
        return null;
    }

    public void updateWhiskey(String name, List<String> flavors ) {
        Whiskey whiskey = getWhiskeyByName(name);
        if (whiskey != null) {
            whiskey.getFlavors().clear();
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
}