package com.programs;

public class RemoveDuplicatesFromIntArray {

	
	public static void main(String[]args) {
		
		int arr[]= {4,5,6,2,4,5,1,9,5,2,8,4,9};
		
		
		for(int i =0; i<arr.length;i++) {
			boolean dup = false;
			int c = 0;
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					c++;
					dup = true;
				}
				
				if(!dup) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}
