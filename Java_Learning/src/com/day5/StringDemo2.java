package com.day5;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String msg ="I love Automation, I can automate web Applications";
		
		
		String arr_msg[] =msg.split(" ");
		
		for(String str: arr_msg) {
			System.out.println(str);
		}

	}

}
