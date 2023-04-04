package com.programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Character> chset = new LinkedHashSet<>();
		String str = "java";

		char ch[] = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			chset.add(str.charAt(i));
		}
System.out.println(chset);

for(char s:chset) {
	System.out.print(s);
}
	}
}
