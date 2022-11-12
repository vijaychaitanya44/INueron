package com.interviewProgram;

public class Print2Largest {

	public static void main(String[] args) {

		int arr[] = { 1, 4,5,35,34 };
		int size=arr.length;
		for(int i=size-1;i>=0;i--) {
			if(arr[i]!=arr[size-1]) {
				System.out.println("The Second largest element is:"+arr[i]);
				break;
			}	
		}
	}
}
