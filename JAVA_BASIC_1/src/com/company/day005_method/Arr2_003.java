package com.company.day005_method;

public class Arr2_003 {
	public static void main(String[] args) {
		int [][] dal = new int[2][3];
		//int data=1;
		/*for(int i=0; i<dal.length; i++) {
			for(int j=0; j<dal[i].length; j++) {
				dal[i][j]= (data*=10)/10;
				
				System.out.print(dal[i][j] + "\t");
			}
			System.out.println();
		}*/
		
		int data1=11;
		for(int i=0; i<dal.length; i++) {
			for(int j=0; j<dal[i].length; j++) {
				dal[i][j] = data1++;
				System.out.print(dal[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
