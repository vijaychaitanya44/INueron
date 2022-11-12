package com.interviewProgram;

public class StringPalindrom {

	
	public static void main(String[] args) {
		
	
		String str="madam";
		String Org_str=str;
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(Org_str.equals(rev)) {
			System.out.println(Org_str+" String Is Palindrom");
		}
		else
		{
			System.out.println(Org_str+" String Is Not Palindrom");
		}
	}
}
