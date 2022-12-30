package com.assignment4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			List<String> strList = new ArrayList<>();
			List<String> wordList = new ArrayList<>();
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter no. of strings");

			int n = sc.nextInt();

			sc.nextLine();
			for (int i = 0; i < n; i++) {
				System.out.println("Enter " + (i + 1) + " member of list: ");
				String sName = sc.nextLine();
				strList.add(sName);
			}

			System.out.println("Entered List: " + strList);

			System.out.println("Enter the word, which should start with: ");
			String word = sc.nextLine();

			

			for (int i = 0; i < n; i++) {
				if (strList.get(i).startsWith(word)) {

					wordList.add(strList.get(i));

				} else {
					if (i < 0)
						System.out.println("No words starting with '" + word + "' present");
				}

			}
			System.out.println("List of words starts with'" + word + "':" + wordList);
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.err.println("Please check the input format entered: "+e.getMessage());
		}
	}
}