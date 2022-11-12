package com.assignment1;

public class Task_10_Break_String {

	public static void main(String[] args) {

		String list1[] = { "Java", "JavaScript", "Selenium", "Python", "Mukesh" };

		for (int x = 0; x < list1.length; x++) {

			if (list1[x] == "Selenium") {
				break;
			}
			System.out.println(list1[x]);
		}
	}

}
