package day04;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

//parsing ==> Each and every element
public class ParsingJsonResponse {
	@Test(priority = 1)
	void testJsonResponse() {
       //Approach1
		
		given()
		
		
		.when()
		.get("https://api.example.com/users")
		
		
		.then()
		.log().all();
	}
}
