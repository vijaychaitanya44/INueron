package com.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CountArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 4, 5, 6, 7, 2, 3, 4, 1, 6, 7, 3, 7 };

		HashMap<Integer, Integer> freq = new LinkedHashMap<>();

		for (int i = 0; i < arr1.length; i++) {
			int count = 0;

			for (int j = 0; j < arr1.length; j++) {

				if (arr1[i] == arr1[j]) {

					count++;
				}

			}

			freq.put(arr1[i], count);
		}
		
	
		
			
			
		}

	}

