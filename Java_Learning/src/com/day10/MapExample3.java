package com.day10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,List<String>> states = new HashMap(); {
			
			List<String> Andhra =Arrays.asList("Visakhapatnam","Anakapalli","Rajahmundry");
			List<String> Karnataka = Arrays.asList("Belgavi","Hubli","Bengaluru");
			List<String> Maharastra = Arrays.asList("Kholapur","Pune","Satara");
			
			
			states.put("AP", Andhra);
			states.put("KA", Karnataka);
			states.put("MH", Maharastra);
			
			
			System.out.println(states);
			
			
			
			System.out.println(states.get("AP"));
			
		};
	}

}
