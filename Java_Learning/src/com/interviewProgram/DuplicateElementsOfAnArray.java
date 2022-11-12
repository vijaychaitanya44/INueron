package com.interviewProgram;

public class DuplicateElementsOfAnArray {

	public static void main(String[] args) {

		int arr[] = new int[] { 3, 5, 3, 5, 6,6};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate Element  "+arr[j]  + " Index of "  + i + " and "+j );
				}
			}
		}
	}
}
