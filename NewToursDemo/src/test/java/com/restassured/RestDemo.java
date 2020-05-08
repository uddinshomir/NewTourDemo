package com.restassured;

import org.testng.annotations.Test;

import com.aventstack.extentreports.gherkin.model.Given;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*; 
import junit.framework.Assert;

public class RestDemo {
	
	@Test
	public void test_01() {
//		Response response = RestAssured.get("https://reqres.in/api/users?page=2"); 
		Response response = get("https://reqres.in/api/users?page=2"); 
		
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
		//	Assrt.assertEquals(statusCode, 201);
				
	}
	
	@Test
	public void test_02() {
		
//		given().get("https://reqres.in/api/users?page=2").then().statusCode(200); 
		given()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("data.id[0]", equalTo(7)); 
	}
}
