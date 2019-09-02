package com.restassured.base;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestBase {

	RequestSpecification httpRequest=RestAssured.given();
	Response response;
}
