package com.programs;

public class Palindrome {

	public void reverseMethod(String str) {
		str = str.toLowerCase();
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		if (revStr.equals(str)) {
			System.out.println("given word " + str + " is PALINDROME");
		} else {
			System.out.println("given word " + str + " is NOT A PALINDROME");
		}
	}

	public void reverseMethod(int number) {

		int revNumber = 0;
		int orgNumber = number;
		while (number != 0) {
			revNumber = revNumber * 10 + number % 10;
			number = number / 10;
		}
		if (orgNumber == revNumber) {
			System.out.println(revNumber);
			System.out.println("given number is Palindrome");
		} else {
			System.out.println("given number is not Palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome p = new Palindrome();

		p.reverseMethod("45554");
	}

}
