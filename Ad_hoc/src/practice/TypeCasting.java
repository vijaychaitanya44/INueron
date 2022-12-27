package practice;

import java.util.ArrayList;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList l = new ArrayList<>();

		l.add("apple");
		l.add("Ball");
	//	l.add(new Integer(10));

		
		String nam1 = (String)l.get(0);
		String nam2 = (String)l.get(1);
		//String nam3 = (String)l.get(2);
		
		
		System.out.println(nam1);
		System.out.println(nam2);
	//	System.out.println(nam3);
		
		
		ArrayList<String> sl = new ArrayList<String>();
		
		sl.add("test1");
		sl.add("Bose");
		
		sl.add("Breeze");
		
		String s1 = (String)sl.get(0);
		String s2 = (String)sl.get(1);
		String s3 = (String)sl.get(2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
