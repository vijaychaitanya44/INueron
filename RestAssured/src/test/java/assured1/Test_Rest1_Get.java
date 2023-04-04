package assured1;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;

public class Test_Rest1_Get {

	@Test
	 void test_01(){
		 //System.out.println(get("https://reqres.in/api/users?page=2"));
		 
		 Response resp = get("https://reqres.in/api/users?page=2");
		 System.out.println(get("https://reqres.in/api/users?page=2"));
		 System.out.println(resp.getBody().asString());
		 System.out.println(resp.getStatusCode());
		 System.out.println(resp.statusLine());
		 System.out.println(resp.getHeader("content-type"));
		 System.out.println(resp.getTime());
		 int STATUSCODE=resp.getStatusCode();

		 Assert.assertEquals(STATUSCODE, 200);
	 }
	@Test
	void test_02() {
		
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200)
		.body("data.id[0]", equalTo(9));
	}
}
