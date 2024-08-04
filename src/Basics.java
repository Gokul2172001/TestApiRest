
import static io.restassured.RestAssured.given;
//import io.restassured.RestAssured;
import static org.hamcrest.Matchers.equalTo;

import files.payload;
import io.restassured.RestAssured;

public class Basics {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://rahulshettyacademy.com";

		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(payload.AddPlace()).when().post("maps/api/place/add/json").then().log().all().statusCode(200)
				.body("scope", equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)");
	}

}
