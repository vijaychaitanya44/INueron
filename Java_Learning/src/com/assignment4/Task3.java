package com.assignment4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			List<String> strList = new ArrayList<>();

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

			Set<String> remDupList = new LinkedHashSet<>(strList);

			System.out.println("After removing duplicates, List is: " + remDupList);
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.err.println("Please check the input format entered: "+e.getMessage());
		}

	}

}
