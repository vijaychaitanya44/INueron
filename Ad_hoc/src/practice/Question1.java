package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object i = new ArrayList().iterator();
		System.out.println((i instanceof List)+",");
		System.out.println((i instanceof Iterator)+",");
		System.out.println(i instanceof ListIterator);
	}

}
