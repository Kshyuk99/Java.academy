package com.company.day010_collection;
//getter/setter, alt+shift+s : 2,3,4,5
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Milk{
	private String name;
	private int price;
	public Milk() { super();  }
	public Milk(String name, int price) { super(); this.name = name; this.price = price; }
	@Override public String toString() { return "Milk [name=" + name + ", price=" + price + "]"; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
	@Override public int hashCode() { return Objects.hash(name, price); }// 객체기반생성고유값
	@Override public boolean equals(Object obj) { //값같은지 확인
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Milk other = (Milk) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}
}
public class Set002 {
	public static void main(String[] args) {
		Set<Milk> set = new HashSet<>();
		set.add(new Milk("Banana", 1800));
		set.add(new Milk("White", 1200));
		set.add(new Milk("Choco", 1500));
		set.add(new Milk("Choco", 1500));
				
		System.out.println(set.size());
		System.out.println(set);
		for(Milk s: set) {System.out.println(s.getName() + "/" + s.getPrice());}
		//set : 순서 X, 중복허용 X   add,get(X)
	}

}
