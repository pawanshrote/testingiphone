package crudoperations;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Putoperation {

	
	@Test
	public void Putusinghashmap()
	{
		
		RestAssured.baseURI = "https://reqres.in/api/users/2";
		RequestSpecification request = RestAssured.given();
		
		
		Map<String, Object>  requestParams = new HashMap<>();
		
		requestParams.put("name", "pawan");
		requestParams.put("job", "leader");
        
        given()
        .contentType(ContentType.JSON)
        .body(requestParams)
        .when()
        .put()
        .then()
        .statusCode(200);
                
    }
	
	@Test
	public void Putusingjsonbody()
	{
		
		RestAssured.baseURI = "https://reqres.in/api/users/2";
		RequestSpecification request = RestAssured.given();
		
	
        given()
        .contentType(ContentType.JSON)
        .body("{\r\n" + 
        		"    \"name\": \"morpheus\",\r\n" + 
        		"    \"job\": \"zion resident\"\r\n" + 
        		"}")
        .when()
        .put()
        .then()
        .statusCode(200);
                
    }
	
}
