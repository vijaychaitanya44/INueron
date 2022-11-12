package com.interviewProgram;

public class ArraySumOfTwoInterval {

	public static void main(String[] args) {
		int array[] = { 10, 12, 15, 18, 67, 10, 18, 67, 12 };
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int sum = 0;
				if (array[i] == array[j]) {
					for (int k = i + 1; k <j ; k++) {
						sum = sum+ array[k];
						System.out.println("sum is " + sum);
						break;
					}
				}
			System.out.print(array[i] + " ");
			}
			//System.out.println(" ");

		}
	}
}
