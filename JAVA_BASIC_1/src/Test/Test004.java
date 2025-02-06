package Test;

public class Test004 {
	public static void main(String[] args) {
		for(int i=2; i<9; i++) {
			System.out.println(i);
			for(int j=1; j<9; j++) {
				System.out.println(i + " * " + i + " = " + (i * j));
			}
			System.out.println();
		}
	}

}
