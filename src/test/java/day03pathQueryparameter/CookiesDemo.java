package day03pathQueryparameter;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Iterator;
import java.util.Map;
public class CookiesDemo {
//	@Test (priority=1)
	void testCookies() {
		
	given()
	
	.when()
	.get("https://www.google.com/")
	
	.then()
	.cookie("AEC","Ad")
	.log().all();
	
	
	}
	@Test(priority=2)
	void getCookiesInfo() {
		
	Response response = given()
	
	.when()
	.get("https://www.google.com/");
	//get single cookie info
	String cookie = response.getCookie("AEC");
	System.out.println("The value of cookie is===>"+cookie);
	//get all cookies info
	Map<String, String> cookies = response.getCookies();
	//System.out.println(cookies.keySet());
	for (String k: cookies.keySet()  ) {
		String cookie2 = response.getCookie(k);
		System.out.println(k+"==>                "+cookie2);
		
	}


	}	

}
