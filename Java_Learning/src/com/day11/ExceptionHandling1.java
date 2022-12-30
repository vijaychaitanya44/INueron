package com.day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please enter num1");
			int num1 = sc.nextInt();
			System.out.println("Please enter num2");
			int num2 = sc.nextInt();

			int n = num1 / num2;

			System.out.println("result is " + n);
		} catch (ArithmeticException e) {
			System.err.println("Printing handeled exception: " + e.getMessage());
		} catch (InputMismatchException e) {
			System.err.println("Printing Input exception: " + e.getMessage());
		} catch (Exception e) {
			System.err.println(" exception: " + e.getMessage());
		} catch (Throwable e) {
			System.err.println(" exception: " + e.getMessage());
		}
		
		finally {
			sc.close();

			System.out.println("Bye");
		}
		
		
	}

}
