package day03pathQueryparameter;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class LoggingDemo {
@Test(priority=1)
	 void testLogging() {
	
	given()
	
	.when()
	.get("https://www.google.com/")
	.then()
	//For entire responce 
	.log().all()
	// For only headers
	.log().headers()
	//For only Body
	.log().body()
	//For cookies
	.log().cookies()
	//for status code
	.log().status();
	

	}
}
