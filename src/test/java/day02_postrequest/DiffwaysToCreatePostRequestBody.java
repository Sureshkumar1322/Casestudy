package day02_postrequest;
import org.json.JSONObject;
/*
  differnce ways to create POST request body
  1)Post request body using Hashmap
  2)Post request body creation using org.json
  3)post request body creation using POJO class
  4)post request using external json file data
 */
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
public class DiffwaysToCreatePostRequestBody {

	//  1)Post request body using Hashmap
	//@Test(priority=1)
	void testPostusingHashMap() {
		HashMap data = new HashMap();
		data.put("name", "scott");
		data.put("location", "london");
		data.put("phonenumber", "67333763287");
		
		String courseArr[]= {"C","C++"};
		data.put("courses", courseArr);
		
		
		given()
		.contentType("application/json")
		.body(data)
		
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.body("name",equalTo("scott"))
		.body("location",equalTo("london"))
		.body("courses[0]",equalTo ("C"))
		.body("courses[1]",equalTo("C++"))
		.header("Content-Type","application/json; charset=utf-8")
		.log().all();
	}
	//   2)Post request body creation using org.json
//	@Test(priority=1)
	void testPostusingjsonlibrary() {
		
		JSONObject data = new JSONObject();
		data.put("name", "scott");
		data.put("location", "london");
		data.put("phonenumber", "67333763287");
		
		String courseArr[]= {"C","C++"};
		data.put("courses", courseArr);
		
		
		given()
		.contentType("application/json")
		.body(data.toString())
		
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.body("name",equalTo("scott"))
		.body("location",equalTo("london"))
		.body("courses[0]",equalTo ("C"))
		.body("courses[1]",equalTo("C++"))
		.header("Content-Type","application/json; charset=utf-8")
		.log().all();
	}
	//   3)post request body creation using POJO class
	@Test(priority=1)
	void testPostusingpojoclass() {
		
		Pojo_postRequest data = new Pojo_postRequest();
		data.setName("scott");
		data.setLocation("london");
		data.setPhone("67333763287");
		String courseArr[]= {"C","C++"};
		data.setCourses(courseArr);
		
		given()
		.contentType("application/json")
		.body(data.toString())
		
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(400)
		.body("name",equalTo("scott"))
		.body("location",equalTo("london"))
		.body("courses[0]",equalTo ("C"))
		.body("courses[1]",equalTo("C++"))
		.header("Content-Type","application/json; charset=utf-8")
		.log().all();
	}
	@Test(priority=2)
	void testDelete() {
		
		given()
		
		.when()
		.delete("https://reqres.in/api/users")
		.then()
		.statusCode(204)
		.log().all();
	}
}
