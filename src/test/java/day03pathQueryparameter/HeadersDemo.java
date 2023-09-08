package day03pathQueryparameter;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.openqa.selenium.devtools.v109.cachestorage.model.Header;
import org.testng.annotations.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;

public class HeadersDemo {
//	@Test (priority=1)
	void testHeader() {
		
	given()
	
	.when()
	.get("https://www.google.com/")
	
	.then()
	.header("Content-Type", "text/html; charset=ISO-8859-1")
	.header("Content-Encoding", "gzip")
	.and()
	.header("Server", "gws");
	
	
	}
	@Test (priority=2)
	void testHeaders() {
		
	Response response = given()
	
	.when()
	.get("https://www.google.com/");
//get single header	
	String header = response.getHeader("Content-Type");
	System.out.println("The value of Content header is"+header);
//get all headers
	Headers headers1 = response.getHeaders();
System.out.println(headers1);

		  
	}
	
	}
	

