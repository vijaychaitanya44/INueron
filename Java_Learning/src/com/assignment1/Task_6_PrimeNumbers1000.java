package com.assignment1;

public class Task_6_PrimeNumbers1000 {

	public static void main(String[] args) {
		// Prime number: Prime number should be divisible by itself and "1" only
		// Count always should be equal to "2"
		// pNum is for 1000 prime numbers
		int pNum = 0;

		int div = 0;

		for (pNum = 1; pNum <= 1000; pNum++) {

			int count = 0;
			for (div = pNum; div >= 1; div--) { // Decrementing the value so that it reaches to "1"

				if (pNum % div == 0) {
					count = count + 1;
				}

			}
			if (count == 2) {// Only twice the number should be divisible with remainder being zero
				System.out.println(pNum + " ");
			}

		}
	}

}
