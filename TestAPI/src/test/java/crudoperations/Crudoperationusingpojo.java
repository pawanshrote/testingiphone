package crudoperations;


import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Crudoperationusingpojo {

	
	
	
	
	@Test
	public void testResponseCode() {
		Pojoobjectsclass pj = new Pojoobjectsclass("pawan,", "leader", "eternus");
		
		RestAssured.baseURI="https://reqres.in/api/users";
		Response res = given().body(pj).when().post().then().statusCode(201).and().contentType(ContentType.JSON).extract().response();
		String str = res.asString();
		System.out.println(str);
		
				
}
}





