package com.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.day6.Emp;

public class ArrayListDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> movie=Arrays.asList("Avatar","James","Zoe","Riri");
		
		//System.out.println(movie);
		
		
		List<Integer> coll=Arrays.asList(4,5,83,123,90);
		
		//System.out.println(coll);
		
		//for loop
		for(int i=0; i<=movie.size()-1;i++) {
			
			System.out.println(movie.get(i));
		}
		
		//for each
		
		for(String mlist:movie) {
			
			System.out.println(mlist);
		}
		
		//Iterator
		
		Iterator<String> movieList= movie.iterator();
		while(movieList.hasNext()) {
			String names=movieList.next();
			System.out.println(names);
		}
	}
	
	
	

}
