package restAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class POSTMETHOD {
	
	String EndPoint = "https://reqres.in/api/users";
	@Test
	public void postMethodDemo() {
		
		 RequestSpecification postrequest = RestAssured.given();
		 postrequest.body("{\r\n"
		 		+ "    \"name\": \"satyashri\",\r\n"
		 		+ "    \"job\": \"IBM\"\r\n"
		 		+ "}");
		// postrequest.header("content-Type","application/json");
		 
		Response postresponse = postrequest.post(EndPoint);
		
		System.out.println(postresponse.getStatusCode());
		
		System.out.println(postresponse.asPrettyString());
		
		Assert.assertEquals(postresponse.statusCode(), 201);
		
		//Assert.assertEquals(postresponse.jsonPath().getString("name"), "satyashri");
		
		
		 
		 
		
		
		
	}

}
