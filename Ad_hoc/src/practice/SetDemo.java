package practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<String> li = new HashSet<>();
		
		li.add("Apple");
		li.add("bingo");
		li.add("Killer");
		
		//System.out.println(li);
		
		Iterator it = li.iterator(); {
			
			
			it.hasNext();
			it.next();
			System.out.println(li);
		};
		
		};
	}

