package com.assignment3;

import java.util.Arrays;
import java.util.List;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> automation = Arrays.asList("Web Automation", "API Automation", "Mobile Automation");

		System.out.println(automation.contains("Mobile Automation"));
		/**
		 * Below commented code is find the list contains "Mobile"
		 */
		/*
		 * for(String li: automation) { if(li.contains("Mobile")) {
		 * System.out.println("True"); } else { System.out.println("False"); } }
		 */
	}

}
