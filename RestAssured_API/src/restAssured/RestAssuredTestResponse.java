package restAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredTestResponse {
	@Test 
	public void GetBookDetails() {
		// Specify the base URL to the RESTful web service 
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books"; 
		// Get the RequestSpecification of the request to be sent to the server 
		RequestSpecification httpRequest = RestAssured.given();
		
		Response response = httpRequest.get("");

	       // Get the status code of the request. 
	       //If request is successful, status code will be 200
	      int statusCode = response.getStatusCode();
	      System.out.println(statusCode);
	      // Assert that correct status code is returned.
	      Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, 
	        "Correct status code returned");
	      String responsebody = response.getBody().asString();
	      System.out.println(responsebody);
	   

}
	
	@Test
	public void GetPetDetails()
	{  
	   // Specify the base URL to the RESTful web service
	       RestAssured.baseURI = "https://demoqa.com/Account/v1/User/";
	       // Get the RequestSpecification of the request to be sent to the server
	       RequestSpecification httpRequest = RestAssured.given();

	       Response response = httpRequest.get("test");

	       // Get the status code of the request. 
	       //If request is successful, status code will be 200
	       int statusCode = response.getStatusCode();

	       // Assert that correct status code is returned.
	       Assert.assertEquals(statusCode /*actual value*/, 401 /*expected value*/, 
	       "Correct status code returned");
	}
	
	@Test public void GetBookDetails1() {
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books"; 
		// Get the RequestSpecification of the request to be sent to the server
		RequestSpecification httpRequest = RestAssured.given(); 
		Response response = httpRequest.get("test");

		// Get the status line from the Response in a variable called statusLine
		String statusLine = response.getStatusLine();
		System.out.println(statusLine);
		Assert.assertEquals(statusLine /*actual value*/, "HTTP/1.1 200 OK" 
		  /*expected value*/, "Correct status code returned");
	}

}
