package com.interviewProgram;

public class CountNoOfWord {

	public static void main(String[] args) {
		String str = " Java selenium php Selenium ";
		int count = 0;
		//char ch[] = new char[str.length()];
		char ch[]=str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			if ((
			(i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ') || (ch[0] != ' ') && (i == 0)))
				count++;
		}
		System.out.println(count);
	}
}
