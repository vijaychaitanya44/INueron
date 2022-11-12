package com.interviewProgram;

import java.util.Scanner;

public class EvenOddSUsingConstructor {

	int number;

	public static void main(String[] args) {

		EvenOddSUsingConstructor constructor = new EvenOddSUsingConstructor(); // When we create Object Default
																				// Constructor is call Automatically..
	}

	// constructor
	public EvenOddSUsingConstructor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("Given No Is Even");
		} else {
			System.out.println("Given No Is Odd");
		}
	}

}
