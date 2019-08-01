package crudoperations;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Postoperation {
	@Test
	public void testResponseCode() {
		
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		Response res = given().body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}\r\n" + 
				"").when().post().then().statusCode(201).and().contentType(ContentType.JSON).extract().response();
		String str = res.asString();
		System.out.println(str);
			
}
	
	// Post using hashmap
	
	@Test
	public void postusinghashmap()
	{
		
		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		RequestSpecification request = RestAssured.given();
		
		
		Map<String, Object>  requestParams = new HashMap<>();
		
		requestParams.put("name", "pawan");
		requestParams.put("job", "leader");
        
        given()
        .contentType(ContentType.JSON)
        .body(requestParams)
        .when()
        .post()
        .then()
        .statusCode(201);
        
          
    }
	}
