package com.assignment4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			List<String> strList = new ArrayList<>();
			List<String> revList = new ArrayList<>();
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter no. of strings");

			int n = sc.nextInt();

			sc.nextLine();
			for (int i = 0; i < n; i++) {
				System.out.println("Enter " + (i + 1) + " member of list: ");
				String sName = sc.nextLine();
				strList.add(sName);
			}

			System.out.println("Entered input List: " + strList);

			for (int i = n - 1; i >= 0; i--) {
				revList.add(strList.get(i));
			}

			System.out.println("Reverse of input List: " + revList);
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.err.println("Please check the input format of the data: " + e.getMessage());
		}

	}
}
