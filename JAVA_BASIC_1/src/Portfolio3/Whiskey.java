package Portfolio3;

import java.util.ArrayList;
import java.util.List;

public class Whiskey {
    public static int num = 0;
    private int no;
    private String type;
    private String name;
    private List<String> flavors;

    public Whiskey(String name, List<String> flavors, String type) {
        this.no = ++num;
        this.type = type;
        this.name = name;
        this.flavors = flavors;
    }

    public Whiskey(int no, String name, List<String> flavors) {
        this.no = no;
        this.name = name;
        this.flavors = flavors;
    }
    public Whiskey() { super(); }
    public Whiskey(String name2, String flavors2) {  }
    public int getNo() { return no; }
    public String getName() { return name; }
    public List<String> getFlavors() { return flavors; }
    public void setNo(int no) { this.no = no; }
    public void setName(String name) { this.name = name; }
    public void setFlavors(List<String> flavors) { this.flavors = flavors; }
    
    
    public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		Whiskey.num = num;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Whiskey [no=" + no + ", type=" + type + ", name=" + name + ", flavors=" + flavors + "]";
	}

	
}