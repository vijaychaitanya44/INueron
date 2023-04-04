package com.programs;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountOfCharInString {

	public static void main(String[] args) {
		String str = "tamilnadulamalaya";
		HashMap<Character, Integer> dup = new LinkedHashMap<>();
		char ch[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
			dup.put(ch[i], count);
		}
		System.out.println(dup.entrySet());

	}

}
