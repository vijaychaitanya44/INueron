package com.interviewProgram;

public class DuplicateWordsInString {

	public static void main(String[] args) {

		String str = "Java Selenium Java Full Stack";
		int count,j;
		// Conver upercase to lower case
		String slc=str.toLowerCase();
		String words[] = slc.split(" ");

		System.out.println("Original String:"+str);
		for (int i = 0; i < words.length; i++) {
			count=1;
			for ( j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}
			if (count > 1 && words[i] != "0") {
			System.out.println("Duplicate String : "+words[i] + " Index " + i + " and "+j );
			}
		}
	}
}
