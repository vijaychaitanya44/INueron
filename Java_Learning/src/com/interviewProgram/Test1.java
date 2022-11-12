package com.interviewProgram;



public class Test1 {
	public static void main(String[] args) {

		String str = "Hi Java";
		String[] words = str.split("");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i]);
		}
	}
}
