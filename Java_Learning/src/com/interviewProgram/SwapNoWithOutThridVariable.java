package com.interviewProgram;

public class SwapNoWithOutThridVariable {

	int a = 5, b = 7;

	public static void main(String[] args) {

		SwapNoWithOutThridVariable swap = new SwapNoWithOutThridVariable();
		swap.Swap();
	}

	public void Swap() {
		System.out.println("Before Swapping Two Number:" + a + "   " + b);
		System.out.println("A ==" + a);
		System.out.println("B ==" + b);
		
		/*
		//1st Approach
		a=a+b;   // 5+7=12 
		b=a-b;   // 12-7=5
		a=a-b;   // 12-5=7 */
		
		a=a*b;  //35 
		b=a/b ;  // 35 / 7  = 5 
		a=a/b;  // 35/5 = 7 
		
		/*
		 * //2nd Approach a = a ^ b; b = a ^ b; a = a ^ b;
		 */
		
		

		System.out.println("After Swapping Two Number:" + a + "   " + b);
		System.out.println("A ==" + a);
		System.out.println("B ==" + b);
	}

}
