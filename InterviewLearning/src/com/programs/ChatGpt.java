package com.programs;

public class ChatGpt {

	public static void main(String[] args) {
		//remove duplicates from an integer array in java without using hashset
		int arr[] = {3,3,45,212,23,5,2,2,};
		    int n = arr.length;
		    for (int i = 0; i < n; i++) {
		        for (int j = i + 1; j < n; j++) {
		            if (arr[i] == arr[j]) {
		                for (int k = j; k < n - 1; k++) {
		                    arr[k] = arr[k + 1];
		                }
		                n--;
		                j--;
		            }
		        }
		    }
		    
		    int[] result = new int[n];
		    for (int i = 0; i < n; i++) {
		        result[i] = arr[i];
		    }
		   System.out.println(result);
		}


	}


