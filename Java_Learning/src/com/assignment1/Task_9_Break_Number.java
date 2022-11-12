package com.assignment1;

public class Task_9_Break_Number {

	public static void main(String[] args) {

		int numz[] = { 12, 34, 66, 85, 900 };

		for (int k = 0; k < numz.length; k++) {

			if (numz[k] == 85) {
				break;
			}
			System.out.println(numz[k]);
		}
	}

}
