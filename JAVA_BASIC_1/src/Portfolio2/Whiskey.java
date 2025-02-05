package Portfolio2;

import java.util.ArrayList;
import java.util.List;

public class Whiskey {
    public static int num = 0;
    private int no;
    private String name;
    private List<String> flavors;
    

    public Whiskey(String name, String flavors, int no) { super();  }
	public Whiskey(String name, List<String> flavors) {
        this.no = ++num;
        this.name = name;
        this.flavors = flavors;
    }
	public Whiskey(String string, String string2, String string3, String string4, String string5) {  }
	public Whiskey(String string, String string2, String string3, String string4) {  }
	public Whiskey(String name2, String flavors2, String string) {  }
	@Override public String toString() { return "Whiskey [no=" + no + ", name=" + name + ", flavors=" + flavors + "]"; }
    public static int getNum() { return num; }
    public int getNo() { return no; }
    public String getName() { return name; }
    public List<String> getFlavors() { return flavors; }
    public static void setNum(int num) { Whiskey.num = num; }
    public void setNo(int no) { this.no = no; }
    public void setName(String name) { this.name = name; }
    public void setFlavors(List<String> flavors) { this.flavors = flavors; }
    
}