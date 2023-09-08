package day03pathQueryparameter;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
public class PathandQueryparameter {

	@Test
	
	void testQueryAndPathParameter() {
		//https://reqres.in/api/users?page=2
		//https://reqres.in/api/users?page=2&id=5
		
		given()
		.pathParam("mypath", "users") //path parameter
		.queryParam("page", 2) // query parameter
		.queryParam("id", 5) // query parameter
		
		.when()
		.get("https://reqres.in/api/{mypath}")
		
		.then()
		.statusCode(200)
		.log().all();
		
		
	}
	
}
