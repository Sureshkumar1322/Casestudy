package day01_Restassured;

/*
given()
content type,set cookies,add auth,add parameter,set headers info etc....
pre-request
when()
get,post,put,delete
request
then()
validate status code,extract response,extract headers cookies &response body...
validation
*/

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class HTTPRequests {

	int id;

@Test(priority=1)
	void getUsers() {

		given()

				.when()

				.get("https://reqres.in/api/users?page=2")

				.then().statusCode(200).body("page", equalTo(2)).log().all();
	}

	@Test(priority = 2)
	void createUser() {
		HashMap data = new HashMap();
		data.put("name", "suresh");
		data.put("job", "engineer");

		id = given().contentType("application/json").body(data)

				.when().post("https://reqres.in/api/users").jsonPath().getInt("id");

	}

	@Test(priority = 3, dependsOnMethods = ("createUser"))
	void updateUser() {
		HashMap data = new HashMap();
		data.put("name", "john");
		data.put("job", "teacher");

		given().contentType("application/json").body(data)

				.when().post("https://reqres.in/api/users" + id)

				.then().statusCode(201).log().all();
	}

	@Test(priority = 4)
	void deleteUser() {
		given()

				.when().delete("https://reqres.in/api/users?page=2")

				.then().statusCode(204).log().all();
		
	}
}