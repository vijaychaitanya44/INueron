package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListForLoop {

	
	public static void main(String[]args) {
		
		
	List<Integer> list = Arrays.asList(34,55,67,90,1,45);
	
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
