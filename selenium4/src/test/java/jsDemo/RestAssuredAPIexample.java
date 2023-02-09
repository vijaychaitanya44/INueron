package jsDemo;

import io.restassured.RestAssured;

public class RestAssuredAPIexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int code = RestAssured.get("https://www.google.com").getStatusCode();
		System.out.println(code);

	}

}
