package helloselenium.services;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.http.ContentType;

import static org.hamcrest.core.IsEqual.equalTo;

import org.hamcrest.Matchers;

import static org.hamcrest.CoreMatchers.containsString;

public class FruitShopCustomer {
	
	private static String endpoint = "https://api.predic8.de:443/shop/customers/";

	@Test
	public void getResponseStatus() {
		given().
		when().
			get(endpoint).
		then()
			.assertThat().statusCode(200);
	}
	
	@Test
	public void postCustomerTest() {
		JSONObject requestParams = new JSONObject();
		String dadoUsername = "Adilson";
		String dadoLastname = "Ferreira";
		requestParams.put("firstname", dadoUsername);
		requestParams.put("lastname", dadoLastname);
		System.out.println(requestParams.toJSONString());
		System.out.println(endpoint);
		given().
			body(requestParams.toJSONString())
			.contentType(ContentType.JSON)
		.when()
			.post(endpoint)
		.then()
			.statusCode(201)
			.body(containsString(dadoUsername));
	}
}
