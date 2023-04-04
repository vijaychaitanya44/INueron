package com.programs;

import java.util.Scanner;

public class Publicis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int key =4;
		int arr[] = new int[s];
		for(int i=0;i<s;i++) {
			
			arr[i]= sc.nextInt();
			
		}
		
		for(int i: arr){
			System.out.print(i+" ");
		}
		
		for(int i=0;i<s;i++) {
			if(key == arr[i]) {
				System.out.println("True");
				System.out.println("True");
				System.out.println("True");
				break;
			}
		}
	}

}
