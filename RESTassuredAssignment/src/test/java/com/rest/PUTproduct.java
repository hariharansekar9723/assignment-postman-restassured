package com.rest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PUTproduct {
  @Test
  public void f() {
	  
	  RestAssured.baseURI="http://localhost:8082/productservice/123";
	  RequestSpecification httprequest = RestAssured.given();
	  JSONObject requestparams = new JSONObject();
	  requestparams.put("productId", 123);
	  requestparams.put("productName", "Android-1");
	  requestparams.put("productDescription", "MobileSoftware");
	  requestparams.put("productPrice", 2000);
	  httprequest.body(requestparams.toString());
	  httprequest.header("Content-Type","application/json");
	  httprequest.body(requestparams.toJSONString());
	  Response response = httprequest.request(Method.PUT,"http://localhost:8082/productservice/123");
	  System.out.println(response.statusCode());
	 
  }
}
