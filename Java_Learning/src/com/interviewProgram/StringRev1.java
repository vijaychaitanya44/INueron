package com.interviewProgram;

public class StringRev1 {
	public static void main(String[] args) {

		String str = "MADAM";
		String rev="";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev+=str.charAt(i);
		}
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println("Palindrom");
		}else {
			System.out.println("No Palindrom");
		}
	}
	
	
}
