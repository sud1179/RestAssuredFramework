package com.restassured.testcases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.restassured.base.TestBase;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_01_UserDetails extends TestBase{
	
	@Test
	public void getSingleUser() {
		RestAssured.baseURI="https://reqres.in";
	    httpRequest=RestAssured.given();
	    response=httpRequest.request(Method.GET, "/api/users/2");
		String body=response.getBody().asString();
		System.out.println(body);
		System.out.println(response.headers());
		System.out.println("---------------------------------------------------------");
		System.out.println(response.statusCode());
		System.out.println("---------------------------------------------------------");
		System.out.println(response.statusLine());
	}
	
	@Test
	public void addUser() {
		RestAssured.baseURI="https://reqres.in";
	    httpRequest=RestAssured.given();
	    
	    
	    //Request Paramaeter
	    JSONObject requestParam =new JSONObject(); 
	    requestParam.put("name", "Sudeep");
	    requestParam.put("job", "QA");
	    httpRequest.header("Contenet-Type", "application/jason");
	    httpRequest.body(requestParam.toJSONString());
	    
	    response=httpRequest.request(Method.POST, "/api/users");
	    String responseBody=response.getBody().asString();
	    System.out.println(responseBody);
	    System.out.println("------------------------");
	    System.out.println(response.getStatusCode());;
	    
	}

}
