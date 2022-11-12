package com.interviewProgram;

import java.util.Scanner;

public class EvenOdd {

	Scanner sc = new Scanner(System.in);
	int number;

	public static void main(String[] args) {
		EvenOdd eo = new EvenOdd();
		eo.EvenOdd();
	}

	// Method..
	public void EvenOdd() {

		System.out.println("Enter The Number:");
		number = sc.nextInt();
		if (number % 2 == 0) {

			System.out.println("Given No Is Even");

		} else {
			System.out.println("Given No is ODD");
		}
	}
}
