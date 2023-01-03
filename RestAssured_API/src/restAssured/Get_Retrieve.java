package restAssured;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Retrieve {
	
	String url = "https://reqres.in/api/users/2";
	@Test
	public void validation() {
		Response response = RestAssured.get(url);
		System.out.println(response.asString());
		//System.out.println(response.getTime());
		//System.out.println(response.getStatusCode());
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200);
		
	}
	 

}


