package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	
	public static void main(String[]args) {
		
		
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(0);
		l1.add(20);
		l1.add(5);
		l1.add(15);
		l1.add(25);
		System.out.println(l1);
		List<Integer> l2= l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
		
		List<Integer> l3 = l1.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(l3);
	}
}
