package com.programs;

import java.util.Scanner;

public class H2 {

	 public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String temp="";
	        /* Enter your code here. Print output to STDOUT. */
	        int  count =A.length();
	        for(int i=A.length()-1;i>=0;i--){
	            temp=temp+A.charAt(i);
	           System.out.println(temp);
	        }
	        if(temp.equals(A)){
	            System.out.println("Yes");
	        }
	        else{
	            System.out.println("No");
	        }
	        
	    }    

}
