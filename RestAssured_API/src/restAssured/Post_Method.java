package restAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Post_Method {

	@Test
	public void postMethod() {
		RestAssured.baseURI ="https://reqres.in/api/users";
		RequestSpecification request = RestAssured.given();
		
		request.header("Content-Type","application/json");

	    JSONObject requestParams = new JSONObject();
	    //{
	  //  "name": "morpheus",
	 //   "job": "leader"
	//}

//	    requestParams.put("email", "eve.holt@reqres.in");
//	    requestParams.put("Password", "pistol");
	    requestParams.put("name", "Rajshri");
	    requestParams.put("job", "cybage");
	    //requestParams.put("age", "23");
//	    requestParams.put("Email",  "sample2ee26d9@gmail.com");

		request.body(requestParams.toJSONString());
		
		Response response = request.post("/creater");
		
		int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		
		 

//		Assert.assertEquals(statusCode, "200");
//		
//		String successCode = response.jsonPath().get("SuccessCode");
//		Assert.assertEquals("Correct Success code was returned", successCode, "OPERATION_SUCCESS");
		
	}
}
