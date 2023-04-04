package com.programs;

public class Pattern3 {

	
	public static void main(String[]args) {
		
		
		//for(int i=0;i<5;i++) {
			
		int alphabet = 65;
			for(int j=5;j>=0;j--) {
				
				for(int k=0;k<=j;k++) {
					System.out.print((char)(alphabet+k)+" ");
				
				}
				System.out.println();
			}
		}
	}

