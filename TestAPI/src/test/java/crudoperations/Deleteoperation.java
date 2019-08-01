package crudoperations;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Deleteoperation {

	
	@Test
	public void deleteoperation()
	{

	RestAssured.baseURI="https://reqres.in/api/users/2";
	Response res = given().contentType(ContentType.JSON).when().delete().then().statusCode(204).and().extract().response();
	
	
	
	
}
}