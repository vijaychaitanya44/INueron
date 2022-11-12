package com.interviewProgram;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		int number, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		number = sc.nextInt();

		for (int i = 1; i <= number; i++) {

			fact = fact * i;

		}
		System.out.println("Factorials Number Is :" + fact);
	}
}
