package com.assignment4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			List<Integer> numList = new ArrayList<>();
			List<Integer> remList = new ArrayList<>();
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter count of numbers to be entered:");

			int n = sc.nextInt();

			if (n > 3) {

				for (int i = 0; i < n; i++) {
					System.out.println("Enter " + (i + 1) + " number of list: ");
					int num = sc.nextInt();
					numList.add(num);

				}

				System.out.println("Entered List: " + numList);

				if (true) {
					remList.add(numList.get(1));
					remList.add(numList.get(numList.size() - 2));
					System.out.println("List of second number, Last second number: " + remList);
				}
			} else {
				System.err.println("Count should be more than '3' to print. Given count is: " +n);
			}
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.err.println("Please check the input format entered: "+e.getMessage());
		}
		

	}

}
