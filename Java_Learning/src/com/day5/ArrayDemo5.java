package com.day5;

public class ArrayDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch[] = new char[5];
		int matx1[][] = new int[3][3];
		int trans1[][] = new int[3][3];
		matx1[0][0] = 45;
		matx1[0][1] = 67;
		matx1[0][2] = 44;
		matx1[1][0] = 11;
		matx1[1][1] = 22;
		matx1[1][2] = 33;
		matx1[2][0] = 78;
		matx1[2][1] = 10;
		matx1[2][2] = 88;

		for (int i = 0; i < matx1.length; i++) {

			for (int j = 0; j < matx1.length; j++) {

				System.out.print(matx1[i][j] + " ");
			}
			System.out.println();
		}
		
		
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				trans1[i][j]= matx1[j][i];
				System.out.print(trans1[i][j] + " ");
			}
			System.out.println();
		}
	}

}
