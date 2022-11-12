package com.interviewProgram;

import java.util.Scanner;

public class PrimeNumberORNot {

	public static void main(String[] args) {

		int number, temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		number = sc.nextInt();

		for (int i = 0; i <= number / 2; i++) {
			if (number % 2 == 0) {
				temp = temp + 1;
				break;
			}
		}
		if (temp == 0) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}

	}
}
