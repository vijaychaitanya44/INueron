package com.programs;

import java.util.LinkedHashSet;

public class Class1 {

	void fibnocci(){
		int n1=0,n2=1,n3;
		int count =10;
		System.out.print(n1+" "+n2);
		for(int i=0;i<count ;i++){
		
		

		n3 = n1+n2;
		System.out.print(n3+" ");
		n1 =n2;
		n2 = n3;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Class1 c1 = new Class1();
		
		String s ="CONFRONTATION";
		char c[] =s.toCharArray();
		System.out.println(c);
		
		System.out.println("duplicate elements");
		
		int count =0;
		
		for(int i=0;i<c.length;i++){
			
			for(int j=i+1;j<c.length;j++){
				
				if(c[i]==c[j]){
					System.out.println(c[j]);
					count++;
					break;
				}
				
				
			}
		}
		
		LinkedHashSet h = new LinkedHashSet();
		for(char a:c){
			h.add(a);
		}
		
		System.out.println(h);
		
		c1.fibnocci();
	}
	
	
}