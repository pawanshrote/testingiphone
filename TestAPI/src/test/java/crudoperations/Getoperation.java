package crudoperations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class Getoperation {

	@Test
	public void testResponseCode() {
		
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		Response res = given().when().get().then().statusCode(200).and().contentType(ContentType.JSON).extract().response();
		String str = res.asString();
		System.out.println(str);
		
		JsonPath js = new JsonPath(str);
		
		int total_pages = js.get("total_pages");
		System.out.println(total_pages);		
	       
		ArrayList<String> arrli = new ArrayList<String>();
		arrli=js.get("data");
		 System.out.println(arrli);
		 
		 JsonPath jsonPath = new JsonPath(str);
		 List<HashMap<String, String>> resultList = jsonPath.get("data");
		 assertEquals(3, resultList.size());
		
	 String emilvalue = resultList.get(1).get("email");
	 System.out.println("the email value is"+ emilvalue);
		 
		 
		 
		 System.out.println(resultList.get(0).get(1));
		 
		
	
	
	}	
}
