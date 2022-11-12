package com.interviewProgram;

import java.util.LinkedHashSet;

public class DuplicateCharcter {
	public static void main(String[] args) {
		String str = "Google";
		LinkedHashSet<Character> lhs=new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++) {
			lhs.add(str.charAt(i));
		}
		
		for(Character ch:lhs) {
			System.out.print(ch);
		}
	}

}
