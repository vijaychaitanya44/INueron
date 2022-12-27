package com.day9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> tools = new ArrayList<>();
		
		tools.add("Cypress");
		tools.add("Autoit");
		tools.add("Selenium");
		
		System.out.println(tools);
		
		
		ArrayList<String> devTools = new ArrayList<>(tools);
		devTools.add("Java");
		devTools.add("c++");
		devTools.add("JS");
		devTools.add("PHP");
		
		System.out.println(devTools);
	}

}
