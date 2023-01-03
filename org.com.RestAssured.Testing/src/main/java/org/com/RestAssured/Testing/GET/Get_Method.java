package org.com.RestAssured.Testing.GET;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Method {

	String url = "https://reqres.in/api/users/2";
	@Test
	public void getRetrieve() {
	
		Response response = RestAssured.get(url);
		System.out.println(response.asString());
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 201);
		
			
	
		
	}
}
