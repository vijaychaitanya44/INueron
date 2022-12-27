package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTestDemo {

	
	public static void main(String[]args) {
		
		List<String> t1 = new ArrayList<>();
		
		t1.add("one");
		t1.add("jul");
		t1.add("Pol");
		t1.add("fout");
		
		System.out.println(t1);
		
		System.out.println(t1.remove("Pol"));
		System.out.println(t1);
		
		
		List<String> h1 = Arrays.asList("King","kong","Fly","Disc");
		
		System.out.println(h1);
		
		h1.remove(0);
		
		h1.remove("Disc");
		
		System.out.println(h1);
	}
}
