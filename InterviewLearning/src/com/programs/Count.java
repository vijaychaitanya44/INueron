package com.programs;

public class Count {

	public static void main(String[] args) {
		
	
		int ar1[] = { 3, 4, 2, 3, 2, 1, 44, 4, 57, 1, 3, 4, 3 };

		int size = ar1.length;
		int i, j, count=0 ;
		for (i = 0; i < size; i++) {
			boolean duplicate = false;
			for (j = i+1; j < i; j++) {
				

				if (ar1[i] == ar1[j]) {
					duplicate = true;
					count++;
					
				}
			}
			if (!duplicate) {
				System.out.println(ar1[i] + " " +count);
			}
		}
	}
	
}