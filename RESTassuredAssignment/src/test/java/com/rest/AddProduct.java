package com.rest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddProduct {
  @Test
  public void f() {
	  
	  RestAssured.baseURI="http://localhost:8082/productservice/addProduct";
	  RequestSpecification httprequest = RestAssured.given();
	  JSONObject requestparams = new JSONObject();
	  requestparams.put("productId", 123);
	  requestparams.put("productName", "Android");
	  requestparams.put("productDescription", "MobileSoftware");
	  requestparams.put("productPrice", 2000);
	  httprequest.body(requestparams.toString());
	  httprequest.header("Content-Type","application/json");
	  httprequest.body(requestparams.toJSONString());
	  Response response = httprequest.request(Method.POST,"http://localhost:8082/productservice/addProduct");
	  System.out.println(response.statusCode());
	  }
}
