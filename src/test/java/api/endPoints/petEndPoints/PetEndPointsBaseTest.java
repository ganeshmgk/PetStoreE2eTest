package api.endPoints.petEndPoints;

import api.endPoints.Routes;
import api.payLoads.petPayLoads.Pet;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PetEndPointsBaseTest {

    public static Response addPet(Pet payload){

        Response response =
         given()
                .contentType("application/json")
                .header("apiKey", Routes.apiKey)
                .body(payload)
        .when()
                .post(Routes.add_pet_url)
        .then()
                 .log().body().log().all()
                .assertThat()
                .statusCode(200)
        .extract()
                 .response();
                //.as()
        return response;
    }
}
