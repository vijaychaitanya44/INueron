package com.day11;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");

		try {
			Thread.sleep(6000);
			System.out.println("slept");
		} catch (InterruptedException e) {
			System.out.println("Timed out: " + e.getMessage());

		}

		System.out.println("End");
	}
}
