package Portfolio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Whiskey {
    public static int num = 0;
    private int no;
    private String name;
    private List<String> flavors;

    public Whiskey(String name, List<String> flavors) {
        this.no = ++num;
        this.name = name;
        this.flavors = flavors;

        if (flavors != null && !flavors.isEmpty()) {
            for (String flavor : flavors) {
                this.flavors.add(flavor);
            }
        }
    }
	public Whiskey() { super();  }


	public Whiskey(String name2, String flavors2) {
		// TODO Auto-generated constructor stub
	}



	public static int getNum() { return num; }
    public int getNo() { return no; }
    public String getName() { return name; }
    public List<String> getFlavors() { return flavors; }
    public static void setNum(int num) { Whiskey.num = num; }
    public void setNo(int no) { this.no = no; }
    public void setName(String name) { this.name = name; }
    public void setFlavors(List<String> flavors) { this.flavors = flavors; }

    @Override
    public String toString() {
        return "Whiskey [no=" + no + ", name=" + name + ", flavors=" + flavors.toString() + "]"; 
    }
}