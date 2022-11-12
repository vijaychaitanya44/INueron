package com.day4;

public class SwitchDemo2 {

	public static void main(String[] args) {

		String browser = "Chrome";

		switch (browser) {

		case "Chrome" :
			System.out.println("Started chrome");
			break;
		case "Firefox":
			System.out.println("Started firefox");
			break;
		case "Safari":
			System.out.println("Started safari");
			break;
		default:
			System.out.println("choose correct browser");
			break;

		}

	}
}
