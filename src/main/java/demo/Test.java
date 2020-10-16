package demo;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Test {

	public static void main(String[] args) {
		String body = "{\"name\": \"morpheus\",\"job\": \"leader\"}";

		given().body(body).post("https://reqres.in/api/users").then().assertThat()
				.body(matchesJsonSchemaInClasspath("ExpectedSchema.json"));

	}

}
