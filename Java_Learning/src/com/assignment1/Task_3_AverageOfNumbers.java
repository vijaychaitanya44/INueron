package com.assignment1;

public class Task_3_AverageOfNumbers {

	public static void main(String[] args) {

		double array1[] = { 10, 90.78, 111, 8989, 7876 };

		double sum = 0;

		for (int i = 0; i < array1.length; i++) {

			sum = sum + array1[i];
		}
		System.out.println("Average of the numbers=" + sum / array1.length);
	}
}
